package com.aop.aoptest.api.controller;

import com.aop.aoptest.api.service.CacheService;
import com.github.benmanes.caffeine.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tjy
 * @ClassName CacheController
 * @Description TODO
 * @Date 19/5/2022 下午9:00
 * @Version 1.0
 **/
@RestController
public class CacheController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "testCache")
    Cache<String,String> cache;

    @Resource(name = "oneHourCacheManager")
    CacheManager cacheManager;

    @Resource
    CacheService cacheService;


    @RequestMapping("/cache")
    public String getCache(){
        String test = cache.getIfPresent("test");
        logger.info("@Resource:{}",test);
//        logger.info("getTest:{}",getTest("test"));
//        logger.info("getTest:{}",getTest("test1"));

        CaffeineCache cache = (CaffeineCache) cacheManager.getCache("test");
        if (cache == null){
            return null;
        }


        String test1 = (String) cache.getNativeCache().asMap().getOrDefault("test", null);
        logger.info("test1,{}",test1);
        logger.info("test2,{}",cacheService.getTest("test"));
        return test;
    }


}
