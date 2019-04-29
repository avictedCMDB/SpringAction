package com.avicted.chapter2.javaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName chapter2JavaConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/11/011 10:11
 * @Version 1.0
 **/
@Configuration
@Import({CDConfig.class, CDPlayerConfig2.class})
@ImportResource("classpath:./resources/chapter2.xml")
public class chapter2JavaConfig {

}
