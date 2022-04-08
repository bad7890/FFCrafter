package com.mengtun.ffcrafter.controller;

import cn.hutool.json.JSONObject;
import com.mengtun.ffcrafter.entity.FFRecipe;
import com.mengtun.ffcrafter.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recipe")
@Slf4j
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    /**
     * 查询配方清单（按职业，按等级）
     * @param job 职业
     * @param minLevel 最小等级（包含）
     * @param maxLevel 最大等级（包含）
     * @return 配方清单
     */
    @GetMapping("getRecipeList")
    public List<FFRecipe> getRecipeByJobAndLevel(@RequestParam(required = false) String job,
                                                 @RequestParam(required = false) Integer minLevel,
                                                 @RequestParam(required = false) Integer maxLevel,
                                                 @RequestParam(required = false) Integer minStar,
                                                 @RequestParam(required = false) Integer maxStar) {
        return recipeService.getRecipeByJobAndLevel(job,minLevel,maxLevel,minStar,maxStar);
    }

    /**
     * 递归查配方树
     * @param recipeId 配方id
     * @return 配方合成树json
     */
    @GetMapping("getRecipeDetailByRecipeId")
    public JSONObject getRecipeDetailByRecipeId(@RequestParam Integer recipeId) {
        return recipeService.getRecipeDetailByRecipeId(recipeId);
    }
}

