package avicted.chapter4;

import com.avicted.chapter2.daoImpl.BankDisc1;
import com.avicted.chapter4.aspect.TrackCounter;
import com.avicted.chapter4.javaConfig.TrackCounterConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @ClassName TrackCounterTest
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/7/007 16:27
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
    private static Logger logger = LoggerFactory.getLogger(TrackCounterTest.class);

    @Autowired
    private BankDisc1 cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void trackCounterTest() {
        cd.play(1);
        cd.play(2);
        cd.play(3);
        cd.play(4);
        cd.play(5);
        cd.play(6);
        cd.play(7);

        Assert.assertEquals(1, counter.getPlayCount(1));

        //Caused by: java.lang.UnsupportedClassVersionError: org/aspectj/lang/annotation/Around : Unsupported major.minor version 52.0
        /*
            J2SE 8 = 52 (0x34 hex)  // 需要安装jdk1.8
            J2SE 7 = 51 (0x33 hex), // 当前笔记本安装jdk1.7
            J2SE 6.0 = 50 (0x32 hex),
            J2SE 5.0 = 49 (0x31 hex),
            JDK 1.4 = 48 (0x30 hex),
            JDK 1.3 = 47 (0x2F hex),
            JDK 1.2 = 46 (0x2E hex),
            JDK 1.1 = 45 (0x2D hex).
        **/
    }


}
