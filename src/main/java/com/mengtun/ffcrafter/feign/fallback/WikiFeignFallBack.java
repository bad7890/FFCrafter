package com.mengtun.ffcrafter.feign.fallback;

import com.mengtun.ffcrafter.feign.WikiFeign;

public class WikiFeignFallBack implements WikiFeign {


  @Override
  public String search(String str) {
    return null;
  }
}
