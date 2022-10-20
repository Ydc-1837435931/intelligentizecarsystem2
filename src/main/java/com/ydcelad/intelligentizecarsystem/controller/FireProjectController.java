package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.FireProject;
import com.ydcelad.intelligentizecarsystem.service.IFireProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/project")
public class FireProjectController {

    @Resource
    private IFireProjectService iFireProjectService;

    @PostMapping("getProjectList")
    public Result getProjectList(@RequestBody FireProject fireProject){
        List<FireProject> list = iFireProjectService.getProjectList(fireProject);
        return Result.success(list);
    }

    @PostMapping("/getProjectById")
    public Result getProjectById(@RequestBody Long Id){
        FireProject fireProject = iFireProjectService.getProjectById(Id);
        return Result.success(fireProject);
    }

    @PostMapping("/deleteProject")
    public Result deleteProject(@RequestBody Long Id){
        iFireProjectService.delProjectById(Id);
        return Result.success();
    }

    @PostMapping("/addProject")
    public Result addProject(@RequestBody FireProject fireProject){
        iFireProjectService.addProject(fireProject);
        return Result.success();
    }

    @PostMapping("/updataProject")
    public Result updataProject(@RequestBody FireProject fireProject){
        iFireProjectService.iFireProjectService(fireProject);
        return Result.success();
    }
}
