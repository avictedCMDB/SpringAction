package com.avicted.chapter4.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AudienceForXml
 * @Description 定义切面
 * @Author xulei
 * @Date 2019/5/6/006 13:09
 * @Version 1.0
 **/
@Aspect
public class Audience {

    @Before("execution(**com.avicted.chapter4.dao.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Sliencing cell phones");
    }

    @Before("execution(**com.avicted.chapter4.dao.com.avicted.chapter4.dao.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(**com.avicted.chapter4.dao.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP!!");
    }

    @AfterThrowing("execution(**com.avicted.chapter4.dao.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }


}
