package com.ydcelad.intelligentizecarsystem.controller;

import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.noticeInfo;
import com.ydcelad.intelligentizecarsystem.service.INoticeInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/noticeInfo")
public class noticeInfoController {

    @Resource
    private INoticeInfoService iNoticeInfoService;

    @PostMapping("/getList")
    public Result list(@RequestBody noticeInfo noticeInfo){
        List<noticeInfo> list = iNoticeInfoService.getlist(noticeInfo);
        return Result.success(list);
    }
}
