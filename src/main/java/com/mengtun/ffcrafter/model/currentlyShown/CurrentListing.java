package com.mengtun.ffcrafter.model.currentlyShown;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentListing implements Serializable {
  private static final long serialVersionUID = 1L;

  private LocalDateTime lastReviewTime;
  private int pricePerUnit;
  private int quantity;
  private int stainID;
  private String worldName;
  private int worldID;
//  private String creatorName;
//  private String creatorID;
  private boolean hq;
  private boolean isCrafted;
  private String listingID;
//  private List<Materia> materia;
  private boolean onMannequin;
//  private int retainerCity;
//  private String retainerID;
//  private String retainerName;
//  private String sellerID;
  private int total;
}
