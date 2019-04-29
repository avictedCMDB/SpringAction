package com.avicted.chapter3.javaConfig;

import com.avicted.chapter2.daoImpl.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExpressiveConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/16/016 9:59
 * @Version 1.0
 **/
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {

        return new BlankDisc(environment.getProperty("disc.title"),
                environment.getProperty("disc.artist"));
    }

}
