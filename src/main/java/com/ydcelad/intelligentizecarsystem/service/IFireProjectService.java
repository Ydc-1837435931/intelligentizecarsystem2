package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;

import java.util.List;

public interface IFireProjectService {
    List<FireProject> getProjectList(FireProject fireProject);

    FireProject getProjectById(Long id);

    void delProjectById(Long id);

    void addProject(FireProject fireProject);

    void iFireProjectService(FireProject fireProject);
}
