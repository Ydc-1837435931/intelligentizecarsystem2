package com.ydcelad.intelligentizecarsystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;

import java.util.List;

@Mapper
public interface MerchantslistInfoMappper {

    List<FireMerchant> selectmerchantslist(FireMerchant fileMerchant);

    public void addmercharts(FireMerchant fireMerchant);

    void delmerchant(Integer id);

    List<FireMerchant> getProjectList();

    List<FireMerchant> getMerchartsByid(Integer id);

    List<FireMerchant> getqueryList(FireMerchant fireMerchant);

    void updateFormSubm(FireMerchant fireMerchant);
}
