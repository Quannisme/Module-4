package com.example.muon_sach.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger= Logger.getLogger(LoggingAspect.class.getName());
    private static long visit=0;
    @Pointcut("execution (* com.example.muon_sach.controller.BookController.doBorrow(..))")
    public void doBorrow(){};

    @Pointcut("execution (* com.example.muon_sach.controller.BookController.doReturn(..))")
    public void doReturn(){}

    @Before("doBorrow() , doReturn()")
    public void getLog(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Before: Call method doBorrow + doReturn" + methodName);
    }
    @After("doBorrow() , doReturn()")
    public void getLogAfter(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        logger.info("After: Call method doBorrow + doReturn" + methodName);
    }

    @After("execution (* com.example.muon_sach.controller.BookController.viewLibrary(..))")
    public void getLogAfterVisit(JoinPoint joinPoint)
    {
        logger.info("number:"+ ++visit);
    }
}
