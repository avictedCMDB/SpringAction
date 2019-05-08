package com.avicted.chapter4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName Audience2
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/7/007 15:37
 * @Version 1.0
 **/
@Aspect
public class Audience2 {

    @Pointcut("execution(**com.avicted.chapter4.dao.Performance.perform(..))")
    public void performance() { }

    @Around("performance()")
    public void watcherPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silenceing cell phones");
            System.out.println("Taking seats");

            jp.proceed();

            System.out.println("CLAP CLAP CLAP!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }


}
