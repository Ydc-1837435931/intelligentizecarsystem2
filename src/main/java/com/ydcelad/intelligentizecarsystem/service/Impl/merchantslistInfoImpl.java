package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.mapper.MerchantsMybatisPlusMapper;
import com.ydcelad.intelligentizecarsystem.service.ImerchantslistInfoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class merchantslistInfoImpl implements ImerchantslistInfoService {

    @Resource
    private com.ydcelad.intelligentizecarsystem.mapper.MerchantslistInfoMappper merchantslistInfoMappper;


    @Override
    public List<FireMerchant> selectmerchantslist(FireMerchant fileMerchant) {
        return merchantslistInfoMappper.selectmerchantslist(fileMerchant);
    }

    @Override
    public void addmercharts(FireMerchant fireMerchant) {
        merchantslistInfoMappper.addmercharts(fireMerchant);
    }

    @Override
    public void delmerchant(Integer id) {
        merchantslistInfoMappper.delmerchant(id);
    }

    @Override
    public List<FireMerchant> getProjectList() {
        return merchantslistInfoMappper.getProjectList();
    }

    @Override
    public List<FireMerchant> getMerchartsByid(Integer id) {
        return merchantslistInfoMappper.getMerchartsByid(id);
    }

    @Override
    public List<FireMerchant> getqueryList(FireMerchant fireMerchant) {
        return merchantslistInfoMappper.getqueryList(fireMerchant);
    }

    @Override
    public void updateFormSubm(FireMerchant fireMerchant) {
        merchantslistInfoMappper.updateFormSubm(fireMerchant);
    }

    @Override
    public List<FireProject> getprojectsListApi() {
        return merchantslistInfoMappper.getprojectsListApi();
    }

    @Override
    public List<FireProject> getprojectsMonthList() {
        return merchantslistInfoMappper.getprojectsMonthList();
    }

    @Override
    public List<FireProject> getprojectListsYearList() {
        return merchantslistInfoMappper.getprojectListsYearList();
    }
}
