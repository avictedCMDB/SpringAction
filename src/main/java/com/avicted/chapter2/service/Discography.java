package com.avicted.chapter2.service;

import com.avicted.chapter2.dao.CompactDisc;

import java.util.List;

/**
 * @ClassName Discography
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/11/011 9:15
 * @Version 1.0
 **/
public class Discography {
    private String artist;
    private List<CompactDisc> cds;

    public Discography(String artist, List<CompactDisc> cds) {
        this.artist = artist;
        this.cds = cds;
    }



}
