package com.mengtun.ffcrafter.model.currentlyShown;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentlyShown implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<Integer> itemIDs;
  private Integer itemID;
  private List<CurrentItem> items;
  private Integer worldID;
  private String dcName;
  private List<Integer> unresolvedItems;
  private String worldName;
}
