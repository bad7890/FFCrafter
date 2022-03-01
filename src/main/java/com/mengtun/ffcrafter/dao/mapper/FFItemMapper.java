package com.mengtun.ffcrafter.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FFItemMapper {
    String getNameById(@Param("id") int id);
}
