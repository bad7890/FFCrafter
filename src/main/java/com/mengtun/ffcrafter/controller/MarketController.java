package com.mengtun.ffcrafter.controller;

import com.mengtun.ffcrafter.model.currentlyShown.CurrentListing;
import com.mengtun.ffcrafter.service.MarketService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("market")
@Slf4j
public class MarketController {

    @Autowired
    private MarketService marketService;

    /**
     * 查询当前物价
     * @param name 中文名
     * @return 当前物价
     */
    @GetMapping("search")
    public List<CurrentListing> searchByName(@RequestParam String name) {
        return marketService.currentlyShown(name);
    }

}

