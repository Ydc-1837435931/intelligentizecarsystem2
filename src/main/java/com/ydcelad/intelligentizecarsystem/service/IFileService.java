package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.Files;

import java.util.List;

public interface IFileService {
    void save(Files saveFile);

    Files selectMd5(String md5);

    List<Files> getlist(Files files);

    int searchByid(Integer id);

    void delFile(Integer id);
}
