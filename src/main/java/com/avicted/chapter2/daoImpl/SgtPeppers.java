package com.avicted.chapter2.daoImpl;

import com.avicted.chapter2.dao.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @ClassName SgtPeppers
 * @Description @Component注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
 * @Author xulei
 * @Date 2019/4/9/009 14:24
 * @Version 1.0
 **/
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Peppers's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void play(int trackNumber) {
        System.out.println("trackNumber");
    }
}
