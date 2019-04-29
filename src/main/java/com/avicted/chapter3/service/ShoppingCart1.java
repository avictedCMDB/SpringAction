package com.avicted.chapter3.service;

import com.avicted.chapter3.dao.ShoppingCart;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName ShoppingCart1
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/16/016 9:16
 * @Version 1.0
 **/
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart1 {

    public ShoppingCart cart() {
        return  new ShoppingCart() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }


}
