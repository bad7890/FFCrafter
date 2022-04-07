package com.mengtun.ffcrafter.dao.mapper;

import com.mengtun.ffcrafter.entity.FFRecipe;
import com.mengtun.ffcrafter.entity.example.FFRecipeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FFRecipeMapper extends BaseMapper<FFRecipe, FFRecipeExample, Integer>{
    List<FFRecipe> getRecipeByItemId(@Param("itemId") Integer itemId);
    FFRecipe getRecipeByRecipeId(@Param("recipeId") Integer recipeId);
    List<FFRecipe> getRecipeByJobAndLevel(@Param("job") String job,@Param("minLevel") Integer minLevel,@Param("maxLevel") Integer maxLevel);
    List<FFRecipe> getRecipeByJob(@Param("job") String job);
    List<FFRecipe> getRecipeByLevel(@Param("minLevel") Integer minLevel,@Param("maxLevel") Integer maxLevel);
    List<FFRecipe> getRecipeAll();
}
