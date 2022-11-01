package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireProject;

import java.util.List;


public interface ImerchantslistInfoService {

    List<FireMerchant> selectmerchantslist(FireMerchant fileMerchant);

    void addmercharts(FireMerchant fireMerchant);

    void delmerchant(Integer id);

    List<FireMerchant> getProjectList();

    List<FireMerchant> getMerchartsByid(Integer id);

    List<FireMerchant> getqueryList(FireMerchant fireMerchant);

    void updateFormSubm(FireMerchant fireMerchant);

    List<FireProject> getprojectsListApi();

    List<FireProject> getprojectsMonthList();

    List<FireProject> getprojectListsYearList();
}
