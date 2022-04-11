package com.aop.aoptest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2022/3/22 15:36
 */
@RestController
@RequestMapping("/aop")
public class BeforeAfterController {
    @GetMapping("/{name}")
    public String testAop(@PathVariable String name) {
        return "Hello " + name;
    }
}
