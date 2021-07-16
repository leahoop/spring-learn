package com.leahoop.producer.aop;

import com.leahoop.producer.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void pointCut() {}

    @Before("pointCut()")
    public void around(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (!Objects.isNull(attributes)) {
            HttpServletRequest request = attributes.getRequest();
            String requestParam = JsonUtil.convert2String(joinPoint.getArgs());
            if (!StringUtils.isEmpty(requestParam)) {
                requestParam = requestParam.substring(0, Math.min(requestParam.length(), 1000));
            }
            log.info("【URL】:{}, 【METHOD】:{}, 【PARAMS】:{}", request.getRequestURI(),
                    request.getMethod(), requestParam);
        }
    }

    @AfterReturning(returning = "ret", pointcut = "pointCut()")
    public void logResponse(Object ret) {
        String responseParams = JsonUtil.convert2String(ret);
        if (!StringUtils.isEmpty(responseParams)) {
            responseParams = responseParams.substring(0, Math.min(responseParams.length(), 1000));
        }
        log.info("【RESPONSE】:{}", responseParams);
    }

}
