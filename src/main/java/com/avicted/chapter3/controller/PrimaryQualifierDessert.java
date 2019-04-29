package com.avicted.chapter3.controller;

import com.avicted.chapter3.dao.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @ClassName PrimaryQualifierDessert
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/15/015 15:32
 * @Version 1.0
 **/
public class PrimaryQualifierDessert {
    private Dessert dessert;

    public PrimaryQualifierDessert(Dessert dessert) {
        this.dessert = dessert;
    }


    @Autowired
    //@Qualifier("iceCream")  //使用限定符来实现自动装配的bean
    @Qualifier("soft")        //与类名解耦
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }


}
