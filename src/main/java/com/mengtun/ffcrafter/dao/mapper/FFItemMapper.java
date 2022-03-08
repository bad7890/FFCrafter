package com.mengtun.ffcrafter.dao.mapper;

import com.mengtun.ffcrafter.entity.FFItem;
import com.mengtun.ffcrafter.entity.example.FFItemExample;
import org.apache.ibatis.annotations.Param;

public interface FFItemMapper extends BaseMapper<FFItem, FFItemExample, Integer>{

  String getNameById(@Param("itemId") Integer itemId);
}
