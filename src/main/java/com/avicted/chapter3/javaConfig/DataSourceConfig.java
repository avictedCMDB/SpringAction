package com.avicted.chapter3.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * @ClassName DataSourceConfig
 * @Description 可以在方法级别上使用注解@Profile，所以可以把多个bean的声明放在同一个配置类之中
 * @Author xulei
 * @Date 2019/4/12/012 9:52
 * @Version 1.0
 **/
@Configuration
public class DataSourceConfig {

    @Bean(destroyMethod = "")
    @Profile("dev")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }


    @Bean
    @Profile("prod")
    public DataSource dataSource1() {
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);

        return (DataSource) jndiObjectFactoryBean.getObject();
    }


}
