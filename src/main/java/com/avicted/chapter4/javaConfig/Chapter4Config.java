package com.avicted.chapter4.javaConfig;

import com.avicted.chapter4.aspect.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName Chapter4Config
 * @Description 使用JavaConfig方式，启用自动代理功能，开启注解功能
 * @Author xulei
 * @Date 2019/5/6/006 13:23
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Chapter4Config {

    @Bean
    public Audience audience() {
        return audience();
    }



}
