package com.mengtun.ffcrafter.feign;

import com.mengtun.ffcrafter.feign.fallback.UniversalisFeignFallBack;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentItem;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentlyShown;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "universalis",
    url = "https://universalis.app",
    path = "api",
    fallback = UniversalisFeignFallBack.class
)
public interface UniversalisFeign {
  @GetMapping(value = "tax-rates", consumes = "text/plain")
  String taxRates(@RequestParam("world") String world);


  @GetMapping(value = "{worldOrDc}/{itemIds}", consumes = "application/json")
  CurrentItem currentlyShown(
      @PathVariable("worldOrDc") String worldOrDc,
      @PathVariable("itemIds") String itemIds);
}
