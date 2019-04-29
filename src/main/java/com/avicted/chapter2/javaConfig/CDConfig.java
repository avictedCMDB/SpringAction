package com.avicted.chapter2.javaConfig;

import com.avicted.chapter2.dao.CompactDisc;
import com.avicted.chapter2.daoImpl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CDConfig
 * @Description 在JavaConfig中引用XML配置
 * @Author xulei
 * @Date 2019/4/11/011 10:05
 * @Version 1.0
 **/
@Configuration
public class CDConfig {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

}
