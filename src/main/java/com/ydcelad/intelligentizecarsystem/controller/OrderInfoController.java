package com.ydcelad.intelligentizecarsystem.controller;


import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.OrderInfo;
import com.ydcelad.intelligentizecarsystem.service.IOrderInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {

    @Resource
    private IOrderInfoService iOrderInfoService;

    @PostMapping("/getList")
    public Result list(@RequestBody OrderInfo orderInfo){
        List<OrderInfo> list = iOrderInfoService.getlist(orderInfo);
        return Result.success(list);
    }
}
