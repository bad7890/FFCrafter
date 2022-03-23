package com.mengtun.ffcrafter.model.wikiSearch;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pagination implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer Page;
  private String PageNext;
  private String PagePrev;
  private Integer PageTotal;
  private Integer Results;
  private Integer ResultsPerPage;
  private Integer ResultsTotal;
}
