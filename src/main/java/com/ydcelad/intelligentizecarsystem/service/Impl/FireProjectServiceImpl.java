package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.mapper.FireProjectMapper;
import com.ydcelad.intelligentizecarsystem.service.IFireProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FireProjectServiceImpl implements IFireProjectService {

    @Resource
    private FireProjectMapper fireProjectMapper;

    @Override
    public List<FireProject> getProjectList(FireProject fireProject) {
        return fireProjectMapper.getProjectList(fireProject);
    }

    @Override
    public FireProject getProjectById(Long id) {
        return fireProjectMapper.getProjectById(id);
    }

    @Override
    public void delProjectById(Long id) {
        fireProjectMapper.deleteProject(id);
    }

    @Override
    public void addProject(FireProject fireProject) {
        fireProjectMapper.addProject(fireProject);
    }

    @Override
    public void iFireProjectService(FireProject fireProject) {
        fireProjectMapper.updataProject(fireProject);
    }
}
