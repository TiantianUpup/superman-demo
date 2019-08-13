package com.h2t.test.aspect;

import com.h2t.test.response.BaseResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 统一返回结果切面
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/02 9:56
 */
@Aspect
@Component
public class ResponseAspect {
    @Around("execution(* com.h2t.test.controller..*(..))")
    public Object controllerProcess(ProceedingJoinPoint pjd) throws Throwable {
        Object result = pjd.proceed();
        //如果controller不返回结果
        if (result == null) {
            return BaseResponse.success(null);
        }

        return BaseResponse.success(result);
    }
}
