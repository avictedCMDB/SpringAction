package com.avicted.chapter2.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CDPlayerConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/9/009 15:21
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = "com.avicted.chapter2")
//@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

}
