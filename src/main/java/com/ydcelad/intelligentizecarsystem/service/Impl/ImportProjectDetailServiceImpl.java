package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.FireImportprojectdetail;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.mapper.ImportProjectDetryMapper;
import com.ydcelad.intelligentizecarsystem.service.ImportProjectDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ImportProjectDetailServiceImpl implements ImportProjectDetailService {

    @Resource
    private ImportProjectDetryMapper importProjectDetryMapper;

    @Override
    public List<FireImportprojectdetail> getimportProjectDetailList(FireImportprojectdetail fireImportprojectdetail) {
        return importProjectDetryMapper.getimportProjectDetailList(fireImportprojectdetail);
    }

    @Override
    public void addImportprojectdetail(FireImportprojectdetail fireImportprojectdetail) {
        try {
            fireImportprojectdetail.setCreateDate(new Date());
            fireImportprojectdetail.setAvaiable(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("添加创建时间出错");
        }
        importProjectDetryMapper.addImportprojectdetail(fireImportprojectdetail);
    }

    @Override
    public void delImportprojectdetail(Integer id) {
        importProjectDetryMapper.delImportprojectdetail(id);
    }

    @Override
    public FireImportprojectdetail getImportProjectDetailById(Integer id) {
        return importProjectDetryMapper.getImportProjectDetailById(id);
    }

    @Override
    public void updateImportProjectDetail(FireImportprojectdetail fireImportprojectdetail) {
        importProjectDetryMapper.updateImportProjectDetail(fireImportprojectdetail);
    }
}
