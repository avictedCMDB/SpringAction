package com.avicted.chapter2.javaConfig;

import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.daoImpl.CDPlayer;
import com.avicted.chapter2.daoImpl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @ClassName CDPlayerConfig1
 * @Description 显示装配bean：通过Java代码
 * @Author xulei
 * @Date 2019/4/10/010 14:41
 * @Version 1.0
 **/
@Component
public class CDPlayerConfig1 {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeggers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    /**
    * @Author xulei
    * @Description 在测试环境中配置数据库信息
    * @Date 15:20 2019/4/11/011
    * @Param []
    * @return javax.sql.DataSource
    **/
    @Bean(destroyMethod = "")
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }

    /**
    * @Author xulei
    * @Description 在开发环境中，配置数据库信息
    * @Date 15:20 2019/4/11/011
    * @Param []
    * @return javax.sql.DataSource
    **/
    @Bean
    public DataSource dataSource1() {
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);

        return (DataSource) jndiObjectFactoryBean.getObject();
    }



    /*@Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeggers());
    }*/

    /*@Bean
    public CompactDisc randomoBeatlesCD() {
        int choice = (int) Math.floor(Math.random() *4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revoler();
        }
    }*/




}
