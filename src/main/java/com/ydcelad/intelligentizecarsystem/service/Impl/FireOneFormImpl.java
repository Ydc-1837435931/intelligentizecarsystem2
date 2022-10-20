package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.entity.Filetable;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireOneForm;
import com.ydcelad.intelligentizecarsystem.entity.Selet;
import com.ydcelad.intelligentizecarsystem.exception.ServiceException;
import com.ydcelad.intelligentizecarsystem.mapper.FireOneFormMapper;
import com.ydcelad.intelligentizecarsystem.service.IFireOneFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FireOneFormImpl implements IFireOneFormService {

    @Resource
    private FireOneFormMapper fireOneFormMapper;

    @Override
    public List<FireOneForm> selectFireOneForm(FireOneForm fireOneForm) {
        return fireOneFormMapper.selectFireOneForm(fireOneForm);
    }

    @Override
    public void addFireOneForm(FireOneForm fireOneForm) {
        if(fireOneForm.getRadio() == 1){
            fireOneFormMapper.addFireOneForm(fireOneForm);
        }else if(fireOneForm.getRadio() == 2){
            fireOneFormMapper.addFireTwoForm(fireOneForm);
        }else if(fireOneForm.getRadio() == 3){
            fireOneFormMapper.addFireThreeForm(fireOneForm);
        }else {
            throw  new ServiceException(Constants.CODE_600,"数据异常");
        }
    }

    @Override
    public void delFileForm(Integer id) {
            fireOneFormMapper.delFileOneForm(id);
    }

    @Override
    public void delFileTwoForm(Integer id) {
        fireOneFormMapper.delFileTwoForm(id);
    }

    @Override
    public void delFileThreeForm(Integer id) {
        fireOneFormMapper.delFileThreeForm(id);
    }

    @Override
    public FireOneForm getFileOneFormByid(Filetable filetable) {
        if (filetable.getFiretabl() == 1) {
            return fireOneFormMapper.getFileOneFormByid(filetable.getFireid());
        } else if (filetable.getFiretabl() == 2) {
            return fireOneFormMapper.getFileTwoFormByid(filetable.getFireid());
        } else if (filetable.getFiretabl() == 3) {
            return fireOneFormMapper.getFileThreeFormByid(filetable.getFireid());
        } else {
            throw new ServiceException(Constants.CODE_600, "数据异常");
        }
    }

    @Override
    public void updatefireOneForm(FireOneForm fireOneForm) {
        if(fireOneForm.getRadio() == 1){
            fireOneFormMapper.updatefireOneForm(fireOneForm);
        }else if(fireOneForm.getRadio() == 2){
            fireOneFormMapper.updatefireTwoForm(fireOneForm);
        }else if(fireOneForm.getRadio() == 3){
            fireOneFormMapper.updatefireThreeForm(fireOneForm);
        }
    }

    @Override
    public List<FireOneForm> getListTableApi(Selet selet) {
        if(selet.getTable() == 1){
            return fireOneFormMapper.selectFireOneFormtable(selet.getProjectid());
        }else if(selet.getTable() == 2){
            return fireOneFormMapper.selectFireTwoFormtable(selet.getProjectid());
        }else if(selet.getTable() == 3){
            return fireOneFormMapper.selectFireThreeFormtable(selet.getProjectid());
        }else {
            throw  new ServiceException(Constants.CODE_600,"数据异常");
        }
    }

    @Override
    public List<FireMerchant> getMerchartsList() {
        return fireOneFormMapper.getMerchartsList();
    }

}
