package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.FireImportprojectdetail;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImportProjectDetryMapper {

    List<FireImportprojectdetail> getimportProjectDetailList(FireImportprojectdetail fireImportprojectdetail);

    void addImportprojectdetail(FireImportprojectdetail fireImportprojectdetail);

    void delImportprojectdetail(Integer id);

    FireImportprojectdetail getImportProjectDetailById(Integer id);

    void updateImportProjectDetail(FireImportprojectdetail fireImportprojectdetail);
}
