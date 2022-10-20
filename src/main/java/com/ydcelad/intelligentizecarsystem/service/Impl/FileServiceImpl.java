package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.Files;
import com.ydcelad.intelligentizecarsystem.mapper.FileMapper;
import com.ydcelad.intelligentizecarsystem.service.IFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FileServiceImpl implements IFileService {

    @Resource
    FileMapper fileMapper;

    @Override
    public void save(Files saveFile) {
        fileMapper.save(saveFile);
    }

    @Override
    public Files selectMd5(String md5) {

        return fileMapper.selectMd5(md5);
    }

    @Override
    public List<Files> getlist(Files files) {
        return fileMapper.getlist(files);
    }

    @Override
    public int searchByid(Integer id) {
        return fileMapper.searchByid(id);
    }

    @Override
    public void delFile(Integer id) {
        fileMapper.delFile(id);
    }
}
