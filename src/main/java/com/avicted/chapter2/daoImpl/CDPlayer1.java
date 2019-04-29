package com.avicted.chapter2.daoImpl;

import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.dao.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName CDPlayer1
 * @Description 使用xml配置bean的属性
 * @Author xulei
 * @Date 2019/4/11/011 9:26
 * @Version 1.0
 **/
public class CDPlayer1 implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
