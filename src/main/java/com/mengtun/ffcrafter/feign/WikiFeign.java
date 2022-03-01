package com.mengtun.ffcrafter.feign;

import com.mengtun.ffcrafter.feign.fallback.WikiFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "wikiEN",
    url = "https://xivapi.com",
    fallback = WikiFeignFallBack.class
)
public interface WikiFeign {

  @GetMapping(value = "search", consumes = "application/json;charset=UTF-8")
  String search(@RequestParam("String") String str);
}
