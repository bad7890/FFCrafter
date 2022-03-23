package com.mengtun.ffcrafter.feign;

import com.mengtun.ffcrafter.config.UnicodeDecoderConfiguration;
import com.mengtun.ffcrafter.feign.fallback.WikiCNFeignFallBack;
import com.mengtun.ffcrafter.model.wikiSearch.SearchVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "wiki",
    url = "https://cafemaker.wakingsands.com",
    fallback = WikiCNFeignFallBack.class
)
public interface WikiCNFeign {

  /**
   *
   * @param name name of item in Chinese
   * @param indexes Search a specific series of indexes separated by commas.
   *   Accepts: Achievement, Title, Action, CraftAction, Trait, PvPAction,
   *   PvPTrait, Status, BNpcName, ENpcResident, Companion,
   *   Mount, Leve, Emote, InstanceContent, Item, Recipe, Fate,
   *   Quest, ContentFinderCondition, Balloon, BuddyEquip,
   *   Orchestrion, PlaceName, Weather, World, Map, lore_finder
   * @return
   */
  @GetMapping(value = "search", consumes = "application/json")
  SearchVo search(
      @RequestParam("String") String name,
      @RequestParam(value = "indexes", required = false) String indexes);
}
