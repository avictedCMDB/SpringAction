package com.avicted.chapter3.daoImpl;

import com.avicted.chapter3.dao.ShoppingCart;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName Cart
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/16/016 9:27
 * @Version 1.0
 **/
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public class Cart implements ShoppingCart {

    public ShoppingCart Cart() {
        return new ShoppingCart() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

}
