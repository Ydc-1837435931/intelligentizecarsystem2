package com.ydcelad.intelligentizecarsystem.controller;


import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.FireImportprojectdetail;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.service.ImportProjectDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/importProjectDetail")
public class FireImportprojectdetailController {

    @Resource
    private ImportProjectDetailService importProjectDetailService;

    @RequestMapping("/getimportProjectDetailList")
    public Result getimportProjectDetailList(@RequestBody FireImportprojectdetail fireImportprojectdetail){
        try{
            List<FireImportprojectdetail> list = importProjectDetailService.getimportProjectDetailList(fireImportprojectdetail);
            return Result.success(list);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(Constants.CODE_500,"参数错误");
        }
    }

    @RequestMapping("/addImportprojectdetail")
    public Result addImportprojectdetail(@RequestBody FireImportprojectdetail fireImportprojectdetail){
        try{
            importProjectDetailService.addImportprojectdetail(fireImportprojectdetail);
            return Result.success();
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(Constants.CODE_500,"添加失败");
        }
    }

    @PostMapping("/delImportprojectdetail")
    public Result delImportprojectdetail(@RequestBody Integer id){
        try{
            importProjectDetailService.delImportprojectdetail(id);
            return Result.success();
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(Constants.CODE_500,"删除失败");
        }
    }

    @PostMapping("/getImportProjectDetailById")
    public Result getImportProjectDetailById(@RequestBody Integer id){
        if(id != null){
            FireImportprojectdetail fireImportprojectdetail = importProjectDetailService.getImportProjectDetailById(id);
            return Result.success(fireImportprojectdetail);
        }else {
            return Result.error(Constants.CODE_401,"参数为空");
        }
    }

    @PostMapping("/updateImportprojectdetail")
    public Result updateImportProjectDetail(@RequestBody FireImportprojectdetail fireImportprojectdetail){
        importProjectDetailService.updateImportProjectDetail(fireImportprojectdetail);
        return Result.success();
    }
}
