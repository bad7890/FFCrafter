package com.mengtun.ffcrafter.feign;

import cn.hutool.json.JSONObject;
import com.mengtun.ffcrafter.feign.fallback.WikiCNFeignFallBack;
import com.mengtun.ffcrafter.model.wikiSearch.SearchVo;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping(value = "recipe", consumes = "application/json")
  JSONObject getRecipeList(@Param("String") Integer page);

  @GetMapping(value = "recipe/{id}", consumes = "application/json")
  JSONObject getRecipeById(@PathVariable(value = "id") Integer id);
}
