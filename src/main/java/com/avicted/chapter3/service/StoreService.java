package com.avicted.chapter3.service;

import com.avicted.chapter3.dao.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName StoreService
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/16/016 9:34
 * @Version 1.0
 **/
@Component
public class StoreService {
    private ShoppingCart shoppingCart;

    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
