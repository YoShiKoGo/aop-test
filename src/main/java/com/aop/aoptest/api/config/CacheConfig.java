package com.aop.aoptest.api.config;

import com.aop.aoptest.api.util.CacheNamesEnum;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author tjy
 * @ClassName CacheConfig
 * @Description TODO
 * @Date 19/5/2022 下午8:23
 * @Version 1.0
 **/
@Configuration
@EnableCaching
public class CacheConfig {
    @Bean(name = "oneHourCacheManager")
    public CacheManager oneHourCacheManager(){
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<CaffeineCache> list        = new ArrayList<>(8);


        CaffeineCache caffeineCache = new CaffeineCache("test",
                Caffeine.newBuilder()
                        .initialCapacity(50)
                        .maximumSize(1000)
                        .build());
        caffeineCache.put("test","test123414");
        list.add(caffeineCache);
        cacheManager.setCaches(list);
        return cacheManager;



//        Caffeine<Object, Object> caffeine = Caffeine.newBuilder()
//                .recordStats()   // 开启缓存状态监控
//                .initialCapacity(500) //初始大小 size
//                .maximumSize(2000);  //最大大小 ,超过后会清理
//
//        CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
//        caffeineCacheManager.setAllowNullValues(true);
//        caffeineCacheManager.setCaffeine(caffeine);
//        caffeineCacheManager.setCacheNames(Collections.singletonList("test"));
//        return caffeineCacheManager;
    }



    @Bean("testCache")
    public Cache<String,String>  getTestCache(){
        Cache<String,String> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .build();
        cache.put("test","test1111");
        return cache;
    }
}
