package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.entity.ProjectDetail;
import com.ydcelad.intelligentizecarsystem.mapper.FiveCensorMapper;
import com.ydcelad.intelligentizecarsystem.service.IFiveCensorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FiveCensorServiceImpl implements IFiveCensorService {

    @Resource
    private FiveCensorMapper fiveCensorMapper;

    @Override
    public FireProject getFireProjectHuizong(Integer projectId) {
        return fiveCensorMapper.getFireProjectHuizong(projectId);
    }

    @Override
    public FireProject getProjectTime(Integer projectId) {
        return fiveCensorMapper.getProjectTime(projectId);
    }

    @Override
    public ProjectDetail getThreeTime(Integer projectId) {
        return fiveCensorMapper.getThreeTime(projectId);
    }

    @Override
    public Integer getbishenbiyan(Integer projectId) {
        return fiveCensorMapper.getbishenbiyan(projectId);
    }

    @Override
    public Integer getyaoqiuyangpingpai(Integer projectId) {
        return fiveCensorMapper.getyaoqiuyangpingpai(projectId);
    }

    @Override
    public Integer getothers(Integer projectId) {
        return fiveCensorMapper.getothers(projectId);
    }
}
