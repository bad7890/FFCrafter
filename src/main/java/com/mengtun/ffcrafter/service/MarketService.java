package com.mengtun.ffcrafter.service;

import com.mengtun.ffcrafter.constant.CommonConstant;
import com.mengtun.ffcrafter.constant.ResponseEnum;
import com.mengtun.ffcrafter.exception.FException;
import com.mengtun.ffcrafter.feign.UniversalisFeign;
import com.mengtun.ffcrafter.feign.WikiCNFeign;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentItem;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentListing;
import com.mengtun.ffcrafter.model.wikiSearch.SearchResult;
import com.mengtun.ffcrafter.model.wikiSearch.SearchVo;
import com.sun.xml.internal.bind.v2.TODO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {

  @Autowired
  private UniversalisFeign universalisFeign;
  @Autowired
  private WikiCNFeign wikiCNFeign;

  public List<CurrentListing> currentlyShown(String itemName) {

    Set<String> worlds = CommonConstant.WORLDS; //get Servers

    SearchVo item = wikiCNFeign.search(itemName, "item");//get id form wiki
    String itemId = null;
    for (SearchResult result : item.getResults()) {
      //todo: search 方法目前是模糊匹配, 需要验证是否名称全等
      if (itemName.equals(result.getName())) {
        itemId = result.getID();
      }
    }

    if (itemId == null) {
      throw FException.ex(ResponseEnum.NOT_FOUND, "未找到物品ID: " + itemName);
    }

    List<CurrentListing> listings = new ArrayList<>(); //result
    for (String world : worlds) {
      CurrentItem currentItem = universalisFeign.currentlyShown(world, itemId);
      List<CurrentListing> worldListings = currentItem.getListings().stream()
          .peek(e -> e.setWorldName(currentItem.getWorldName()))
          .collect(Collectors.toList());

      listings.addAll(worldListings);
    }

    //处理所有结果, 按价格排序
    listings = listings.stream()
        .sorted(Comparator.comparing(CurrentListing::getPricePerUnit))
        .collect(Collectors.toList());

    return listings;
  }
}
