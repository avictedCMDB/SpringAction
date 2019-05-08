package com.avicted.chapter4.javaConfig;

import com.avicted.chapter2.daoImpl.BankDisc1;
import com.avicted.chapter2.daoImpl.BlankDisc;
import com.avicted.chapter4.aspect.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TrackCounterConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/7/007 16:10
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public BankDisc1 sgtPeppers() {
        BankDisc1 cd = new BankDisc1();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Heats Club Band");
        tracks.add("With a Little Help from My friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        cd.setTracks(tracks);

        return cd;
    }


    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
