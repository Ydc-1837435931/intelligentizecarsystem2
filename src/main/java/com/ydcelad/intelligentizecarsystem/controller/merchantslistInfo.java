package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.service.ImerchantslistInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/xincheng")
public class merchantslistInfo {

    @Resource
    private ImerchantslistInfoService imerchantslistInfoService;

    @PostMapping("/SmerchantslistInfo")
    public Result list(@RequestBody FireMerchant fireMerchant){
        List<FireMerchant> list = imerchantslistInfoService.selectmerchantslist(fireMerchant);
        return Result.success(list);
    }

    @PostMapping("/addmercharts")
    public Result addmercharts(@RequestBody FireMerchant fireMerchant){
        imerchantslistInfoService.addmercharts(fireMerchant);
        return Result.success();
    }

    @PostMapping("/getMerchartsByid")
    public Result getMerchartsByid(@RequestBody Integer id){
        List<FireMerchant> list = imerchantslistInfoService.getMerchartsByid(id);
        return Result.success(list);
    }

    @PostMapping("/delmerchant")
    public Result delmerchantForm(@RequestBody Integer id){
        imerchantslistInfoService.delmerchant(id);
        return Result.success();
    }

    @PostMapping("/getprojectsList")
    public Result getMerchartsList(){
        List<FireMerchant> list = imerchantslistInfoService.getProjectList();
        return Result.success(list);
    }

    @PostMapping("/getqueryList")
    public Result getqueryList(@RequestBody FireMerchant fireMerchant){
        List<FireMerchant> list = imerchantslistInfoService.getqueryList(fireMerchant);
        return Result.success(list);
    }

    @PostMapping("/updateFormSubm")
    public Result updateFormSubm(@RequestBody FireMerchant fireMerchant){
        try{
            imerchantslistInfoService.updateFormSubm(fireMerchant);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.success();
    }




}
