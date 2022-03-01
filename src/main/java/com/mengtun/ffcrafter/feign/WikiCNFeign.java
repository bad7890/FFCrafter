package com.mengtun.ffcrafter.feign;

import com.mengtun.ffcrafter.config.UnicodeDecoderConfiguration;
import com.mengtun.ffcrafter.feign.fallback.WikiCNFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "wiki",
    url = "https://cafemaker.wakingsands.com",
    fallback = WikiCNFeignFallBack.class,
    configuration = UnicodeDecoderConfiguration.class
)
public interface WikiCNFeign {

  @GetMapping(value = "search", consumes = "application/json;charset=UTF-8")
  String search(@RequestParam("String") String str);
}
