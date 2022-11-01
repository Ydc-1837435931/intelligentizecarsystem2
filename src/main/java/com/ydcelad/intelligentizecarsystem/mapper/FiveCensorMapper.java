package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.entity.ProjectDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FiveCensorMapper {
    FireProject getFireProjectHuizong(Integer projectId);

    FireProject getProjectTime(Integer projectId);

    ProjectDetail getThreeTime(Integer projectId);

    Integer getbishenbiyan(Integer projectId);

    Integer getyaoqiuyangpingpai(Integer projectId);

    Integer getothers(Integer projectId);
}
