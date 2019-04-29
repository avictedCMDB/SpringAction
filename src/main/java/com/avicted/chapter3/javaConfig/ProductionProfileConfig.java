package com.avicted.chapter3.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * @ClassName ProductionProfileConfig
 * @Description 适用于生产环境的配置
 * 只有prod profile激活时，才会创建对应的bean
 * @Author xulei
 * @Date 2019/4/11/011 16:12
 * @Version 1.0
 **/
@Configuration
@Profile("prod")
public class ProductionProfileConfig {

    @Bean
    public DataSource dataSource1() {
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);

        return (DataSource) jndiObjectFactoryBean.getObject();
    }




}
