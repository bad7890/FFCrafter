package com.mengtun.ffcrafter.feign.fallback;

import com.mengtun.ffcrafter.feign.WikiCNFeign;

public class WikiCNFeignFallBack implements WikiCNFeign {


  @Override
  public String search(String str) {
    return null;
  }
}
