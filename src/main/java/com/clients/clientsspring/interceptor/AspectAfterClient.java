package com.clients.clientsspring.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAfterClient {

    Logger logger = LogManager.getLogger(AspectAfterClient.class);

    @Pointcut("@annotation(com.clients.clientsspring.annotations.LogAfter)")
    public void allControllersWithCustomAnnotation() {
    }

    @After("allControllersWithCustomAnnotation()")
    public void logMsgAfterExecution(JoinPoint jp) {
        logger.info("EXECUTED METHOD NAME: " + jp.getSignature().getName());
    }
}
