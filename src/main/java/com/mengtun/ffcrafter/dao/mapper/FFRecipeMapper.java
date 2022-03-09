package com.mengtun.ffcrafter.dao.mapper;

import com.mengtun.ffcrafter.entity.FFRecipe;
import com.mengtun.ffcrafter.entity.example.FFRecipeExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FFRecipeMapper extends BaseMapper<FFRecipe, FFRecipeExample, Integer>{

}
