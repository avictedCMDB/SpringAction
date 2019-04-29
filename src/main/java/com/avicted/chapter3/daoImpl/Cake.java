package com.avicted.chapter3.daoImpl;

import com.avicted.chapter3.dao.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ClassName Cake
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/15/015 11:16
 * @Version 1.0
 **/
@Component
@Qualifier("soft")
public class Cake implements Dessert {
}
