package com.aop.aoptest.api.annotation;

import com.aop.aoptest.constant.BuryingPointColumnEnum;

import java.lang.annotation.*;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2022/3/18 13:41
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionsAnnotation {
    //列名，用于额外标识，存放一些辅助信息
    BuryingPointColumnEnum column() default BuryingPointColumnEnum.COLUMN_DEFAULT;
}
