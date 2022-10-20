package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.entity.XiaofangVO;
import com.ydcelad.intelligentizecarsystem.service.IFiveCensorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fivecensor")
public class fivecensorController {

    @Resource
    private  IFiveCensorService iFiveCensorService;

    @PostMapping("/getfivecensor")
    public Result getFiveCensorHuizong(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        if (fireProject.getZhaoshangst() != null || fireProject.getZhaoshangsj() != null){
            XiaofangVO xiaofangVO = new XiaofangVO();
            xiaofangVO.setName("招商实际签约数量");
            xiaofangVO.setValue(fireProject.getZhaoshangst().intValue());
            XiaofangVO xiaofangVO1 = new XiaofangVO();
            xiaofangVO1.setName("招商计划签约总数");
            xiaofangVO1.setValue(fireProject.getZhaoshangsj().intValue()-fireProject.getZhaoshangst().intValue());
            list1.add(xiaofangVO);
            list1.add(xiaofangVO1);
            return Result.success(list1);
        }else {
            return Result.error();
        }
    }

    @PostMapping("/getchutuData")
    public Result getchutuData(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        XiaofangVO xiaofangVO = new XiaofangVO();
        xiaofangVO.setName("商户实际出图数量");
        xiaofangVO.setValue(fireProject.getChutust().intValue());
        XiaofangVO xiaofangVO1 = new XiaofangVO();
        xiaofangVO1.setName("商户计划出图总数");
        xiaofangVO1.setValue(fireProject.getChutusj().intValue()-fireProject.getChutust().intValue());
        list1.add(xiaofangVO);
        list1.add(xiaofangVO1);
        return Result.success(list1);
    }

    @PostMapping("/getxiaofangtuData")
    public Result getxiaofangtuData(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        XiaofangVO xiaofangVO = new XiaofangVO();
        xiaofangVO.setName("消防图纸内审实际完成数量");
        xiaofangVO.setValue(fireProject.getXiaofangtust().intValue());
        XiaofangVO xiaofangVO1 = new XiaofangVO();
        xiaofangVO1.setName("消防图纸内审计划完成总数");
        xiaofangVO1.setValue(fireProject.getXiaofangtusj().intValue()-fireProject.getXiaofangtust().intValue());
        list1.add(xiaofangVO);
        list1.add(xiaofangVO1);
        return Result.success(list1);
    }

    @PostMapping("/xiaofangtuzichaData")
    public Result xiaofangtuzichaData(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        XiaofangVO xiaofangVO = new XiaofangVO();
        xiaofangVO.setName("商户消防自查实际完成数量");
        xiaofangVO.setValue(fireProject.getXiaofangzichast().intValue());
        XiaofangVO xiaofangVO1 = new XiaofangVO();
        xiaofangVO1.setName("商户消防自查计划完成总数");
        xiaofangVO1.setValue(fireProject.getXiaofangzichasj().intValue()-fireProject.getXiaofangzichast().intValue());
        list1.add(xiaofangVO);
        list1.add(xiaofangVO1);
        return Result.success(list1);
    }

    @PostMapping("/xiaoyanData")
    public Result xiaoyanData(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        XiaofangVO xiaofangVO = new XiaofangVO();
        xiaofangVO.setName("商户二消验收实际完成数量");
        xiaofangVO.setValue(fireProject.getXiaoyanst().intValue());
        XiaofangVO xiaofangVO1 = new XiaofangVO();
        xiaofangVO1.setName("商户二消验收计划完成总数");
        xiaofangVO1.setValue(fireProject.getXiaoyansj().intValue()-fireProject.getXiaoyanst().intValue());
        list1.add(xiaofangVO);
        list1.add(xiaofangVO1);
        return Result.success(list1);
    }

    @PostMapping("/kaiyejianData")
    public Result kaiyejianData(@RequestBody Integer projectId){
        List<XiaofangVO> list1 = new ArrayList<>();
        FireProject fireProject = iFiveCensorService.getFireProjectHuizong(projectId);
        XiaofangVO xiaofangVO = new XiaofangVO();
        xiaofangVO.setName("商户开业检实际完成数量");
        xiaofangVO.setValue(fireProject.getKaiyejianst().intValue());
        XiaofangVO xiaofangVO1 = new XiaofangVO();
        xiaofangVO1.setName("商户开业检计划完成总数");
        xiaofangVO1.setValue(fireProject.getKaiyejiansj().intValue()-fireProject.getKaiyejianst().intValue());
        list1.add(xiaofangVO);
        list1.add(xiaofangVO1);
        return Result.success(list1);
    }


    @PostMapping("/getProTime")
    public Result getProTime(@RequestBody Integer projectId){
        FireProject fireProject = iFiveCensorService.getProjectTime(projectId);
        return Result.success(fireProject);
    }

}
