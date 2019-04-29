package com.avicted.chapter3.daoImpl;

import com.avicted.chapter3.dao.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ClassName IceCream
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/15/015 11:17
 * @Version 1.0
 **/
@Component
@Primary    // 在组件级别 标识首选的bean
public class IceCream implements Dessert {
}
