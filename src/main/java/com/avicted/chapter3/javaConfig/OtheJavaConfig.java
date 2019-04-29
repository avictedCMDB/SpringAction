package com.avicted.chapter3.javaConfig;

import com.avicted.chapter3.bean.Notepad;
import com.avicted.chapter3.controller.MagicBean;
import com.avicted.chapter3.dao.ShoppingCart;
import com.avicted.chapter3.daoImpl.MagicExistsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName OtheJavaConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/15/015 9:55
 * @Version 1.0
 **/
@Configuration
public class OtheJavaConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)    // 条件化地创建bean:是否设置了magic环境属性。
    public MagicBean magicBean() {
        return new MagicBean();
    }


    /**
    * @Author xulei
    * @Description Java代码显示配置原型作用域
    * @Date 8:46 2019/4/16/016
    * @Param []
    * @return com.avicted.chapter3.bean.Notepad
    **/
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad() {
        return new Notepad();
    }




}
