package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.Filetable;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireOneForm;
import com.ydcelad.intelligentizecarsystem.entity.Selet;

import java.util.List;

public interface IFireOneFormService {

    List<FireOneForm> selectFireOneForm(FireOneForm fireOneForm);

    void addFireOneForm(FireOneForm fireOneForm);

    void delFileForm(Integer id);

    List<FireOneForm> getListTableApi(Selet selet);

    List<FireMerchant> getMerchartsList();

    void delFileTwoForm(Integer id);

    void delFileThreeForm(Integer id);

    FireOneForm getFileOneFormByid(Filetable filetable);

    void updatefireOneForm(FireOneForm fireOneForm);

}
