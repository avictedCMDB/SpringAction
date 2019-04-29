package com.avicted.chapter3.daoImpl;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName MagicExistsCondition
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/15/015 9:59
 * @Version 1.0
 **/
public class MagicExistsCondition implements Condition {

    /**
    * @Author xulei
    * @Description TODO
    * @Date 10:54 2019/4/15/015
    * @Param [context:具有5个功能
     *         metadata:检查带有@Bean注解的方法上还有什么其他的注解。
     *         ]
    * @return boolean
    **/
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return env.containsProperty("magic");
    }
}
