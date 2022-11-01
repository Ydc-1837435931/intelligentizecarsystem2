package com.ydcelad.intelligentizecarsystem;

import com.ydcelad.intelligentizecarsystem.mapper.XiaofangDataGetMapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//用于测试Service和Dao层的方法
@SpringBootTest
class IntelligentizecarsystemApplicationTests {

    private static final Logger LOGGER= LoggerFactory.getLogger(IntelligentizecarsystemApplicationTests.class);

    @Resource
    private XiaofangDataGetMapper xiaofangDataGetMapper;

    @Test
    void contextLoads() {
        System.out.println("test!!!!!!!!!!!!!!!!!");
    }

    @Test
    void testGetFireoneformcount(){
        Integer count = xiaofangDataGetMapper.getFireOneFormCount();
        System.out.println(count+"!!!!!!");
    }



}
