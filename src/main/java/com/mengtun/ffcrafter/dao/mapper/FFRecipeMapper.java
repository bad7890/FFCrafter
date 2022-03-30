package com.mengtun.ffcrafter.dao.mapper;

import cn.hutool.json.JSONObject;
import com.mengtun.ffcrafter.entity.FFRecipe;
import com.mengtun.ffcrafter.entity.example.FFRecipeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FFRecipeMapper extends BaseMapper<FFRecipe, FFRecipeExample, Integer>{
    JSONObject getRecipeByItemId(@Param("itemId") Integer itemId);
    JSONObject getRecipeByRecipeId(@Param("itemId") Integer itemId);
}
