package com.ydcelad.intelligentizecarsystem.mapper;


import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireOneForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FireOneFormMapper {

    List<FireOneForm> selectFireOneForm(FireOneForm fireOneForm);

    public void addFireOneForm(FireOneForm fireOneForm);

    public void addFireTwoForm(FireOneForm fireOneForm);

    public void addFireThreeForm(FireOneForm fireOneForm);

    void delFileOneForm(Integer id);

    void delFileTwoForm(Integer id);

    void delFileThreeForm(Integer id);

    List<FireOneForm> selectFireOneFormtable(Long projectid);

    List<FireOneForm> selectFireTwoFormtable(Long projectid);

    List<FireOneForm> selectFireThreeFormtable(Long projectid);

    List<FireMerchant> getMerchartsList();

    FireOneForm getFileOneFormByid(Long fireid);

    FireOneForm getFileTwoFormByid(Long fireid);

    FireOneForm getFileThreeFormByid(Long fireid);

    void updatefireOneForm(FireOneForm fireOneForm);

    void updatefireTwoForm(FireOneForm fireOneForm);

    void updatefireThreeForm(FireOneForm fireOneForm);
}
