package com.avicted.chapter4.aspect;

import com.avicted.chapter4.dao.Encoreable;
import com.avicted.chapter4.daoImpl.DefaultImplEncoreable;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @ClassName EncoreableIntroducer
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/8/008 14:29
 * @Version 1.0
 **/
public class EncoreableIntroducer {

    @DeclareParents(value = "com.avicted.chapter4.dao.Performance+", defaultImpl = DefaultImplEncoreable.class)
    public static Encoreable encoreable;
}
