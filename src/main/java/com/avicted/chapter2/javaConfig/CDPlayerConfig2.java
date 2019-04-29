package com.avicted.chapter2.javaConfig;

import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.daoImpl.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName CDPlayerConfig2
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/11/011 10:08
 * @Version 1.0
 **/
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig2 {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
