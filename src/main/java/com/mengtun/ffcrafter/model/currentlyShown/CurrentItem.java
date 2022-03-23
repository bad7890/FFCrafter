package com.mengtun.ffcrafter.model.currentlyShown;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentItem implements Serializable {

  private static final long serialVersionUID = 1L;
  private Integer itemID;
  private Integer worldID;
  private LocalDateTime lastUploadTime;
  private List<CurrentListing> listings;
  private List<RecentHistory> recentHistory;
  private String dcName;
  private Integer currentAveragePrice;
  private Integer currentAveragePriceNQ;
  private Integer currentAveragePriceHQ;
  private Integer regularSaleVelocity;
  private Integer nqSaleVelocity;
  private Integer hqSaleVelocity;
  private Integer averagePrice;
  private Integer averagePriceNQ;
  private Integer averagePriceHQ;
  private Integer minPrice;
  private Integer minPriceNQ;
  private Integer minPriceHQ;
  private Integer maxPrice;
  private Integer maxPriceNQ;
  private Integer maxPriceHQ;
//  private StackSizeHistogram stackSizeHistogram;
//  private StackSizeHistogramNQ stackSizeHistogramNQ;
//  private StackSizeHistogramHQ stackSizeHistogramHQ;
  private String worldName;
//  private WorldUploadTimes worldUploadTimes;
}
