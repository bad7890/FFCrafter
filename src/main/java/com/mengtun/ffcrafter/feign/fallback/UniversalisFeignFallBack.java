package com.mengtun.ffcrafter.feign.fallback;

import com.mengtun.ffcrafter.feign.UniversalisFeign;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentItem;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentlyShown;

public class UniversalisFeignFallBack implements UniversalisFeign {

  @Override
  public String taxRates(String world) {
    return null;
  }

  @Override
  public CurrentItem currentlyShown(String worldOrDc, String itemIds) {
    return null;
  }

}
