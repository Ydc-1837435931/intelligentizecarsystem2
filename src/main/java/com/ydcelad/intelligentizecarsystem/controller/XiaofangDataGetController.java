package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.config.AuthAccess;
import com.ydcelad.intelligentizecarsystem.entity.XiaofangVO;
import com.ydcelad.intelligentizecarsystem.service.IXiaofangDataGetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/xiaofangGetData")
public class XiaofangDataGetController {

    @Resource
    private IXiaofangDataGetService iXiaofangDataGetService;


    @PostMapping("/getxiaofangzongshu")
    public Result getxiaofangzongshu(){
        List list =  iXiaofangDataGetService.getxiaofangzongshu();
        List<XiaofangVO> list1 = new ArrayList<>();
        for (int i = 0; i < list.toArray().length; i++) {
              XiaofangVO xiaofangVO = new XiaofangVO();
//              xiaofangVO.setName("大商户"+(i+1)+"级消防");
//              xiaofangVO.setValue(Integer.parseInt(list.get(i).toString()));
            if(i == 0){
                xiaofangVO.setName("大商户一级消防");
                xiaofangVO.setValue(Integer.parseInt(list.get(i).toString()));
            }else if(i == 1){
                xiaofangVO.setName("大商户二级消防");
                xiaofangVO.setValue(Integer.parseInt(list.get(i).toString()));
            }else {
                xiaofangVO.setName("大商户开业检");
                xiaofangVO.setValue(Integer.parseInt(list.get(i).toString()));
            }
            list1.add(i,xiaofangVO);
        }
        return Result.success(list1);
    }
}
