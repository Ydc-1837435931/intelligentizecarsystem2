package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.Files;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
    void save(Files saveFile);

    Files selectMd5(String md5);

    List<Files> getlist(Files files);

    int searchByid(Integer id);

    void delFile(Integer id);
}
