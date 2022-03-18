package com.aop.aoptest.api.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2022/3/18 13:19
 */
@RestController
@RequestMapping("/aop")
public class AopController {

    @GetMapping(value = "/getTest")
    public JSONObject aopTest() {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }



}
