package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.entity.ProjectDetail;

import java.util.Date;

public interface IFiveCensorService {

    FireProject getFireProjectHuizong(Integer projectId);

    FireProject getProjectTime(Integer projectId);

    ProjectDetail getThreeTime(Integer projectId);

    Integer getbishenbiyan(Integer projectId);

    Integer getyaoqiuyangpingpai(Integer projectId);

    Integer getothers(Integer projectId);
}
