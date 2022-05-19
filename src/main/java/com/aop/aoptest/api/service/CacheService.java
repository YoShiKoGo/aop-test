package com.aop.aoptest.api.service;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tjy
 * @ClassName cacheService
 * @Description TODO
 * @Date 19/5/2022 下午11:46
 * @Version 1.0
 **/
@Service
public class CacheService {


    @Cacheable(cacheManager = "oneHourCacheManager",cacheNames = "test",value = "test",key = "#userName")
    public String getTest(String userName) {
        return "sdfsdfsf";
    }
}
