package com.aop.aoptest.api.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author tjy
 * @ClassName CacheNamesEnum
 * @Description caffeine所有cacheName
 * @Date 19/5/2022 下午10:34
 * @Version 1.0
 **/
@Getter
@AllArgsConstructor
public enum CacheNamesEnum {
    /**
     * 所有本地缓存name，各个map对应的key，相当于redis中hash存储 field，key，value中的field
     */
    CJ("CJ",20),
    FAVORITE_MAP("favorite",30),
    ZY_MANAGER_CHANNEL_MAP("zyManagerChannel",30),
    ZY_USER_MAP("zyUserMap",30),
    URL_UID_MAP("urlUidMap",60),
    CACHE_MISS_MAP("cacheMissMap",15),
    ALL_CHANNEL_CACHE_MAP("allChannelMapCache",60),
    SYSTEM_CHANNEL_FLAG("systemChannelFlag",30),
    TAG_ONLINE("onLineTag",120),
    TAG_SON_LINE("",120);

    /** name **/
    private final String name;
    /** 过期时间,时间单位秒 **/
    private final int expires;
}
