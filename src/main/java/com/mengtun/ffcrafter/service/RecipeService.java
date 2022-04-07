package com.mengtun.ffcrafter.service;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.mengtun.ffcrafter.dao.mapper.FFRecipeMapper;
import com.mengtun.ffcrafter.entity.FFRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecipeService {

  @Autowired
  FFRecipeMapper ffRecipeMapper;

  public List<FFRecipe> getRecipeByJobAndLevel(String job,Integer minLevel,Integer maxLevel){
    List<FFRecipe> ffRecipeList;
    if(job==null||minLevel==null||maxLevel==null)return null;
    if(job.equals("")&&maxLevel==0)
      ffRecipeList=ffRecipeMapper.getRecipeAll();
    else if(job.equals(""))
      ffRecipeList=ffRecipeMapper.getRecipeByLevel(minLevel,maxLevel);
    else if(maxLevel==0)
      ffRecipeList=ffRecipeMapper.getRecipeByJob(job);
    else
      ffRecipeList=ffRecipeMapper.getRecipeByJobAndLevel(job,minLevel,maxLevel);
    return ffRecipeList;
  }

  public JSONObject getRecipeDetailByRecipeId(Integer recipeId){
    FFRecipe recipe=ffRecipeMapper.getRecipeByRecipeId(recipeId);
    JSONObject recipeJson= JSONUtil.parseObj(recipe);
    for(int i=0;i<10;i++){
      String material="recipeMaterial"+i;
      String materialNumName="recipeMaterialNum"+i;
      Integer materialNum=recipeJson.getInt(materialNumName);
      if(materialNum>0){
        Integer materialId=recipeJson.getInt(material);
        String recipeName="recipe"+i;
        JSONObject subRecipeJson=getRecipeDetailByItemId(materialId);
        if(subRecipeJson!=null)
          recipeJson.set(recipeName,subRecipeJson);
      }
    }
    return recipeJson;
  }

  public JSONObject getRecipeDetailByItemId(Integer itemId){
    List<FFRecipe> recipeList=ffRecipeMapper.getRecipeByItemId(itemId);
    if(recipeList.size()==0)return null;
    FFRecipe recipe=recipeList.get(0);
    JSONObject recipeJson= JSONUtil.parseObj(recipe);
    for(int i=0;i<10;i++){
      String material="recipeMaterial"+i;
      String materialNumName="recipeMaterialNum"+i;
      Integer materialNum=recipeJson.getInt(materialNumName);
      if(materialNum>0){
        Integer materialId=recipeJson.getInt(material);
        String recipeName="recipe"+i;
        JSONObject subRecipeJson=getRecipeDetailByItemId(materialId);
        if(subRecipeJson!=null)
          recipeJson.set(recipeName,subRecipeJson);
      }
    }
    return recipeJson;
  }
}
