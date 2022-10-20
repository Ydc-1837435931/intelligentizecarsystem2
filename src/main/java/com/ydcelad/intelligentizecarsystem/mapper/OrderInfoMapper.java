package com.ydcelad.intelligentizecarsystem.mapper;


import com.ydcelad.intelligentizecarsystem.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderInfoMapper {

    List<OrderInfo> getList(OrderInfo orderInfo);
}
