package com.avicted.chapter4.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TrackCounter
 * @Description 记录每个磁道播放次数的切面
 * @Author xulei
 * @Date 2019/5/7/007 15:57
 * @Version 1.0
 **/
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* com.avicted.chapter2.daoImpl.BankDisc1(int))" + "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){}     //上述两个参数的名字必须一致才可以


    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }



}
