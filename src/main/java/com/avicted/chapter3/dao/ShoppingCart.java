package com.avicted.chapter3.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName ShoppingCart
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/16/016 9:08
 * @Version 1.0
 **/
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public interface ShoppingCart {

}
