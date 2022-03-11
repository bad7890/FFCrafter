package com.mengtun.ffcrafter.controller;

import com.mengtun.ffcrafter.constant.ResponseEnum;
import com.mengtun.ffcrafter.exception.FException;
import com.mengtun.ffcrafter.feign.UniversalisFeign;
import com.mengtun.ffcrafter.feign.WikiCNFeign;
import com.mengtun.ffcrafter.feign.WikiFeign;
import com.mengtun.ffcrafter.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private WikiFeign wikiFeign;
    @Autowired
    private WikiCNFeign wikiCNFeign;
    @Autowired
    private UniversalisFeign universalisFeign;

    //数据库链接测试
    @GetMapping("db")
    public String getById(@RequestParam Integer id) {
        return testService.getById(id);
    }

    //英文 wiki test get
    @GetMapping("wiki/search")
    public String wiki(@RequestParam String str) {
        return wikiFeign.search(str);
    }

    //中文 wiki test get
    @GetMapping("wiki/cn/search")
    public String wikiCn(@RequestParam String str) {
        return wikiCNFeign.search(str);
    }

    //物价网 test get
    @GetMapping("tax")
    public String taxRates(@RequestParam String str) {
        return universalisFeign.taxRates(str);
    }


    //报错测试
    @GetMapping("error")
    public String getById() {
        throw FException.ex(ResponseEnum.FORBIDDEN);

    }

}
