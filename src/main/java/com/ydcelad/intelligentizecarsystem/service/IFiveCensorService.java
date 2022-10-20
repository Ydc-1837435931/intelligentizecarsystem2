package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;

import java.util.Date;

public interface IFiveCensorService {

    FireProject getFireProjectHuizong(Integer projectId);

    FireProject getProjectTime(Integer projectId);
}
