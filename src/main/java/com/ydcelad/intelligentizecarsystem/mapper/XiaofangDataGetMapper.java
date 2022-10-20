package com.ydcelad.intelligentizecarsystem.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XiaofangDataGetMapper {
     Integer getFireOneFormCount();

     Integer getFireTwoFormCount();

     Integer getFireThreeFormCount();
}
