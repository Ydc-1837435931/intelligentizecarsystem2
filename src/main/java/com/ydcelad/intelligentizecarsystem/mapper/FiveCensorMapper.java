package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FiveCensorMapper {
    FireProject getFireProjectHuizong(Integer projectId);

    FireProject getProjectTime(Integer projectId);
}
