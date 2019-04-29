package com.avicted.chapter2;

import com.avicted.chapter2.javaConfig.CDPlayerConfig;
import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.dao.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;

/**
 * @ClassName CDPlayerTest
 * @Description TODO
 * @Author xulei
 * @Date 2019/4/10/010 9:58
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void playTest() {
        player.play();
    }

}
