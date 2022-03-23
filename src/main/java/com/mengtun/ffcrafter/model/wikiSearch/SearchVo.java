package com.mengtun.ffcrafter.model.wikiSearch;

import com.mengtun.ffcrafter.model.FeignVo;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchVo implements Serializable, FeignVo {
  private static final long serialVersionUID = 1L;

  private Pagination Pagination;
  private List<SearchResult> Results;
//  private int SpeedMs;
}
