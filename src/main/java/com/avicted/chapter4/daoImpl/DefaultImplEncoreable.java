package com.avicted.chapter4.daoImpl;

import com.avicted.chapter4.dao.Encoreable;

/**
 * @ClassName DefaultImplEncoreable
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/8/008 14:28
 * @Version 1.0
 **/
public class DefaultImplEncoreable implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("implement Encoreable");
    }


}
