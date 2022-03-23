package com.mengtun.ffcrafter.model.wikiSearch;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String ID;
//  private String Icon;
  private String Name;
//  private Date Url;
  private String UrlType;
//  private String _;
//  private String _Score;
}
