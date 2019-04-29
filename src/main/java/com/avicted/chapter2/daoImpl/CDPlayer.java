package com.avicted.chapter2.daoImpl;

import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.dao.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName CDPlayer
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/10/010 14:12
 * @Version 1.0
 **/
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    /*@Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }*/




}
