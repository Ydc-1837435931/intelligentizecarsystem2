package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FireProjectMapper {

    List<FireProject> getProjectList(FireProject fireProject);

    FireProject getProjectById(Long id);

    void deleteProject(Long id);

    void addProject(FireProject fireProject);

    void updataProject(FireProject fireProject);
}
