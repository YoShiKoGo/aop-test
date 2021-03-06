package com.aop.aoptest.api.advice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aop.aoptest.api.annotation.PermissionsAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2022/3/18 13:43
 */
@Aspect
@Component
@Order(1)
public class PermissionFirstAdvice {
    // 定义一个切面，括号内写入第1步中自定义注解的路径
    @Pointcut("@annotation(permissionsAnnotation)")
    private void permissionCheck(PermissionsAnnotation permissionsAnnotation) {
    }

    @Around("permissionCheck(permissionsAnnotation)")
    public Object permissionCheckFirst(ProceedingJoinPoint joinPoint,PermissionsAnnotation permissionsAnnotation) throws Throwable {
        System.out.println("===================第一个切面===================：" + System.currentTimeMillis());
        System.out.println("类型："+permissionsAnnotation.column());
        //获取请求参数，详见接口类
        Object[] objects = joinPoint.getArgs();
        Long id = ((JSONObject) objects[0]).getLong("id");
        String name = ((JSONObject) objects[0]).getString("name");
        System.out.println("id1->>>>>>>>>>>>>>>>>>>>>>" + id);
        System.out.println("name1->>>>>>>>>>>>>>>>>>>>>>" + name);

        // id小于0则抛出非法id的异常
        if (id < 0) {
            return JSON.parseObject("{\"message\":\"illegal id\",\"code\":403}");
        }

        // 修改入参
        JSONObject object = new JSONObject();
        object.put("id", 8);
        object.put("name", "lisi");
        objects[0] = object;
        return joinPoint.proceed(objects);
    }
}
