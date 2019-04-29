package com.avicted.chapter3.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName Notepad
 * @Description 在组件上设置原型作用域
 * @Author xulei
 * @Date 2019/4/16/016 8:44
 * @Version 1.0
 **/
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {
}
