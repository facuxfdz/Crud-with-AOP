package com.clients.clientsspring.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAroundClient {

    Logger logger = LogManager.getLogger(AspectAroundClient.class);


    @Pointcut("execution(* com.clients.clientsspring.service.ClientService.*(..))" +
            "&& !execution(* com.clients.clientsspring.service.ClientService.deleteClient(..))")
    public void allMinusDelete() {}

    @Around("allMinusDelete()")
    public void logARound() {
        logger.info("Around method");
    }
}
