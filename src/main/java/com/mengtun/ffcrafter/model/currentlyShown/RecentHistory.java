package com.mengtun.ffcrafter.model.currentlyShown;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecentHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  private boolean hq;
  private int pricePerUnit;
  private int quantity;
  private LocalDateTime timestamp;
  private String worldName;
  private int worldID;
  private String buyerName;
  private int total;
}
