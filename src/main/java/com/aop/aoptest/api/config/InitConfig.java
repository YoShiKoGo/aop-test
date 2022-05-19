//package com.aop.aoptest.api.config;
//
//import com.aop.aoptest.api.util.SpringContextUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.cache.Cache;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.caffeine.CaffeineCache;
//import org.springframework.cache.caffeine.CaffeineCacheManager;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//
///**
// * @author tjy
// * @ClassName InitConfig
// * @Description TODO
// * @Date 19/5/2022 下午8:32
// * @Version 1.0
// **/
//@Component
//public class InitConfig implements ApplicationRunner {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        CaffeineCacheManager userResourceCacheManager =(CaffeineCacheManager) SpringContextUtil.getBean("oneHourCacheManager", CacheManager.class);
//        CaffeineCache cache = (CaffeineCache) userResourceCacheManager.getCache("test");
//        Collection<String> cacheNames = userResourceCacheManager.getCacheNames();
//        cache.getNativeCache().asMap().put("test","test2345435345353453453");
//        logger.info(cacheNames.toString());
//        cache.put("test1","test1234123");
//        logger.info("添加完成！！");
//
//    }
//}
