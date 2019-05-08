package com.avicted.chapter4.aspectForXml;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TrackCounterForXml
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/8/008 15:25
 * @Version 1.0
 **/
public class TrackCounterForXml {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }


}
