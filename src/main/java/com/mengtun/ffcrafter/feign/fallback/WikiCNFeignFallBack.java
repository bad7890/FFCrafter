package com.mengtun.ffcrafter.feign.fallback;

import com.mengtun.ffcrafter.feign.WikiCNFeign;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentItem;
import com.mengtun.ffcrafter.model.wikiSearch.SearchVo;

public class WikiCNFeignFallBack implements WikiCNFeign {


  @Override
  public SearchVo search(String name, String indexs) {
    return null;
  }
}
