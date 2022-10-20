package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.OrderInfo;

import java.util.List;

public interface IOrderInfoService {
    List<OrderInfo> getlist(OrderInfo orderInfo);
}
