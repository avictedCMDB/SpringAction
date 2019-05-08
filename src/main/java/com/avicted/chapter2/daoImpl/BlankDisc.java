package com.avicted.chapter2.daoImpl;

import com.avicted.chapter2.dao.CompactDisc;

import java.util.List;

/**
 * @ClassName BlankDisc
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/10/010 16:11
 * @Version 1.0
 **/
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void play(int trackNumber) {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }



}
