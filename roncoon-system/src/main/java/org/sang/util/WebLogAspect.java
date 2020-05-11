package org.sang.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.sang.entity.SysLog;
import org.sang.service.SysLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class WebLogAspect {
    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
    @Autowired
    SysLogService sysLogService;

    @Pointcut("execution(public * org.sang.controller..*.*(..))")//切入点
    public void controllerRoleLog(){}//签名  切入点名称

    @Pointcut("execution(* org.sang.controller.*.*(..))")
    public void controllerUserLog(){}
//   || controllerUserLog()

    @Before("controllerRoleLog() || controllerUserLog() ") //在切入点run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();//这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        // 记录下请求内容
        logger.info("################URL : " + request.getRequestURL().toString());//请求url
        logger.info("################HTTP_METHOD : " + request.getMethod());//提交方式
        logger.info("################IP : " + GetIp.getIpAddress(request));//ip地址
        logger.info("################THE ARGS OF THE CONTROLLER : " + Arrays.toString(joinPoint.getArgs()));//参数

        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        logger.info("################CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        loggers.setLoggerurl(request.getRequestURL().toString());
//        loggers.setLoggertype(request.getMethod());
//        loggers.setLoggercreateid(1);
//        loggers.setLoggerparameter(Arrays.toString(joinPoint.getArgs()));
//        loggers.setLoggerip(GetIp.getIpAddress(request));
//        loggers.setLoggerclass(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        loggers.setLoggercreatetime(new Date());
//        sysLogService.insert(loggers);

    }
}
