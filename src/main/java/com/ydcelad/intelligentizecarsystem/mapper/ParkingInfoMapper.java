package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.ParkingInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParkingInfoMapper {

    List<ParkingInfo> selectParkingInfoList(ParkingInfo parkingInfo);

    ParkingInfo selectParkingById(Long parkingInfo);
}
