package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireImportprojectdetail;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;

import java.util.List;

public interface ImportProjectDetailService {
    List<FireImportprojectdetail> getimportProjectDetailList(FireImportprojectdetail fireImportprojectdetail);

    void addImportprojectdetail(FireImportprojectdetail fireImportprojectdetail);

    void delImportprojectdetail(Integer id);

    FireImportprojectdetail  getImportProjectDetailById(Integer id);

    void updateImportProjectDetail(FireImportprojectdetail fireImportprojectdetail);
}
