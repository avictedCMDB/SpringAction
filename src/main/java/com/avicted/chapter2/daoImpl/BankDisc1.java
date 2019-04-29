package com.avicted.chapter2.daoImpl;

import com.avicted.chapter2.dao.CompactDisc;

import java.util.List;

/**
 * @ClassName BankDisc1
 * @Description 将字面量注入到属性中
 * @Author xulei
 * @Date 2019/4/11/011 9:37
 * @Version 1.0
 **/
public class BankDisc1 implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }




}
