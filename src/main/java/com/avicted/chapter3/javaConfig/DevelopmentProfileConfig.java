package com.avicted.chapter3.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

/**
 * @ClassName DevelopmentProfileConfig
 * @Description 适用于开发环境的配置
 * 只有dev profile激活时，才会创建对应的bean
 * @Author xulei
 * @Date 2019/4/11/011 16:09
 * @Version 1.0
 **/
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

    @Bean(destroyMethod = "")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }


}
