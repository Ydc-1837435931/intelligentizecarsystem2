package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.Filetable;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.FireOneForm;
import com.ydcelad.intelligentizecarsystem.entity.Selet;
import com.ydcelad.intelligentizecarsystem.exception.ServiceException;
import com.ydcelad.intelligentizecarsystem.service.IFireOneFormService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/fireOneForm")
public class FireOneFormController {

    @Resource
    private IFireOneFormService iFireOneFormService;

    @PostMapping("/SelectFireOneForm")
    public Result list(@RequestBody FireOneForm fireOneForm){
        List<FireOneForm> list = iFireOneFormService.selectFireOneForm(fireOneForm);
        return Result.success(list);
    }

    @PostMapping("/getListTableApi")
    public Result getListTableApi(@RequestBody Selet selet){
        List<FireOneForm> list = iFireOneFormService.getListTableApi(selet);
        return Result.success(list);
}

    @PostMapping("/addFireOneForm")
    public Result addFireOneForm(@RequestBody FireOneForm fireOneForm){
        iFireOneFormService.addFireOneForm(fireOneForm);
        return Result.success();
    }
    //FileTable用于定位消防问题，一消二消开业检
    @PostMapping("/getFileOneFormByid")
    public Result getFileOneFormByid(@RequestBody Filetable filetable){
        System.out.println(filetable.getFiretabl() + "!!!!!!!!!" + filetable.getFireid());
        FireOneForm fireOneForm = iFireOneFormService.getFileOneFormByid(filetable);
        if(fireOneForm.getMerchantName() != null){
            return Result.success(fireOneForm);
        }else {
            throw  new ServiceException(Constants.CODE_600, "数据异常");
        }
    }

    @PostMapping("/delFileForm")
    public Result delFileForm(@RequestBody Integer id){

        iFireOneFormService.delFileForm(id);
        return Result.success();
    }

    @PostMapping("/delFileTwoForm")
    public Result delFileTwoForm(@RequestBody Integer id){

        iFireOneFormService.delFileTwoForm(id);
        return Result.success();
    }

    @PostMapping("/delFileThreeForm")
    public Result delFileThreeForm(@RequestBody Integer id){

        iFireOneFormService.delFileThreeForm(id);
        return Result.success();
    }

    @PostMapping("/getMerchartsList")
    public Result getMerchartsList(){
        List<FireMerchant> list = iFireOneFormService.getMerchartsList();
        return Result.success(list);
    }

    @PostMapping("/updatefireOneForm")
    public Result updatefireOneForm(@RequestBody FireOneForm fireOneForm){
        try {
            iFireOneFormService.updatefireOneForm(fireOneForm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.success();
    }


}
