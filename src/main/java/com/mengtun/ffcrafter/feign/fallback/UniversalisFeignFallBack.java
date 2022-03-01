package com.mengtun.ffcrafter.feign.fallback;

import com.mengtun.ffcrafter.feign.UniversalisFeign;

public class UniversalisFeignFallBack implements UniversalisFeign {

  @Override
  public String taxRates(String world) {
    return null;
  }
}
