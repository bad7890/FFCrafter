package com.mengtun.ffcrafter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mengtun.ffcrafter.constant.ResponseEnum;
import com.mengtun.ffcrafter.exception.FException;
import com.mengtun.ffcrafter.feign.UniversalisFeign;
import com.mengtun.ffcrafter.feign.WikiCNFeign;
import com.mengtun.ffcrafter.feign.WikiFeign;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentItem;
import com.mengtun.ffcrafter.model.currentlyShown.CurrentlyShown;
import com.mengtun.ffcrafter.model.wikiSearch.SearchVo;
import com.mengtun.ffcrafter.service.TestService;
import com.mengtun.ffcrafter.util.JsonUtil;
import java.time.LocalDateTime;
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
    public SearchVo wikiCn(
        @RequestParam String name,
        @RequestParam(required = false) String indexes) {
        try {

            return wikiCNFeign.search(name, indexes);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
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

    //当前物价测试
    @GetMapping("currentlyShown")
    public String test() {
        CurrentItem hongYuHai = universalisFeign.currentlyShown("HongYuHai", "27958");
        return hongYuHai.toString();
    }
public static void main(String[] args) {
        String a = " {\"Pagination\":{\"Page\":1,\"PageNext\":null,\"PagePrev\":null,\"PageTotal\":1,\"Results\":1,\"ResultsPerPage\":100,\"ResultsTotal\":1},\"Results\":[{\"ID\":27958,\"Icon\":\"\\/i\\/024000\\/024412.png\",\"Name\":\"\\u5de8\\u5320\\u836f\\u6c34\",\"Url\":\"\\/Item\\/27958\",\"UrlType\":\"Item\",\"_\":\"item\",\"_Score\":\"21.97065\"}],\"SpeedMs\":0}"
            ;
    try {
        JsonUtil.MAPPER.readValue(a, SearchVo.class);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
}
}
