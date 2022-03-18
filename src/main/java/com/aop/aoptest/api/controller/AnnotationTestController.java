package com.aop.aoptest.api.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aop.aoptest.api.annotation.PermissionsAnnotation;
import com.aop.aoptest.constant.BuryingPointColumnEnum;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2022/3/18 13:49
 */
@RestController
@RequestMapping(value = "/permission")
public class AnnotationTestController {
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    // 添加这个注解
    @PermissionsAnnotation(column = BuryingPointColumnEnum.COLUMN_QUERYFLIGHT)
    public JSONObject getGroupList(@RequestBody JSONObject request) {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }
}
