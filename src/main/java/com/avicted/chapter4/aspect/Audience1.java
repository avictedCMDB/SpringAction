package com.avicted.chapter4.aspect;

import org.aspectj.lang.annotation.*;

/**
 * @ClassName Audience1
 * @Description 定义切面--可重用的切点
 * @Author xulei
 * @Date 2019/5/6/006 13:17
 * @Version 1.0
 **/
@Aspect
public class Audience1 {
    /**
    * @Author xulei
    * @Description 定义可重用切点
    **/
    @Pointcut("execution(**com.avicted.chapter4.dao.Performance.perform(..))")
    public void performance() { }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Sliencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
