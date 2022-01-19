package com.clients.clientsspring.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
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
        logger.info("METHOD HAS BEEN EXECUTED - Method name: " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.clients.clientsspring.service.ClientService.updateClient(..))")
    public void logMissingFieldsError(){
        logger.error("All fields must be provided");
    }
}
