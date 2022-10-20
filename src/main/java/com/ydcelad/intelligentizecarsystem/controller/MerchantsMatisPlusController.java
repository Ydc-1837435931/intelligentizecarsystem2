package com.ydcelad.intelligentizecarsystem.controller;

import cn.hutool.core.util.PageUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.TopicCondition;
import com.ydcelad.intelligentizecarsystem.service.IMerchantsMybatisPlusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/merchants")
public class MerchantsMatisPlusController {

    @Resource
    private IMerchantsMybatisPlusService iMerchantsMybatisPlusService;

    @RequestMapping("/getMerchantList")
    public Result merchantsList(Model model, TopicCondition con){
        if(con.getPageNo() == null){
            con.setPageNo(1);
        }
        if(con.getPageSize() == null){
            con.setPageSize(4);
        }
        IPage<FireMerchant> retPage = iMerchantsMybatisPlusService.queryByCondition(con);
        model.addAttribute("topics",retPage.getRecords());  //数据
        model.addAttribute("pageNo",retPage.getCurrent());   //页号
        model.addAttribute("totalPages",retPage.getPages());  //总页数
        int[] pageNums = PageUtil.rainbow((int)retPage.getCurrent(),(int)retPage.getPages(),4);
        model.addAttribute("pagenums",pageNums);
        return Result.success(model);
    }
}
