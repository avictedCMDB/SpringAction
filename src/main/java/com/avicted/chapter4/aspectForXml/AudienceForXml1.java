package com.avicted.chapter4.aspectForXml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName AudienceForXml1
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/8/008 15:17
 * @Version 1.0
 **/
public class AudienceForXml1 {

    public void watchPerformance(ProceedingJoinPoint pj) {
        try {
            System.out.println();
            System.out.println();

            pj.proceed();

            System.out.println();

        } catch (Throwable e) {
            System.out.println();
        }
    }

}
