package com.avicted.chapter3;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.avicted.chapter3.javaConfig.PersistenceTestConfig;

/**
 * @ClassName PersistenceTest
 * @Description 测试Profile功能
 * @Author xulei
 * @Date 2019/4/12/012 13:44
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceTestConfig.class) //启动测试环境中需要使用的配置文件
@ActiveProfiles("dev")                                       //激活dev profile
public class PersistenceTest {

}
