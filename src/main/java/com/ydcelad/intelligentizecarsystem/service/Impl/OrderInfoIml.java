package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.OrderInfo;
import com.ydcelad.intelligentizecarsystem.entity.noticeInfo;
import com.ydcelad.intelligentizecarsystem.mapper.OrderInfoMapper;
import com.ydcelad.intelligentizecarsystem.service.IOrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoIml implements IOrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> getlist(OrderInfo orderInfo) {
        return orderInfoMapper.getList(orderInfo);
    }
}
