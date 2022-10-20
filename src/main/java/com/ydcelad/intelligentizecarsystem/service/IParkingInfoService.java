package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.ParkingInfo;

import java.util.List;

public interface IParkingInfoService {
    List<ParkingInfo> selectParkingInfoList(ParkingInfo parkingInfo);

    ParkingInfo selectParkingById(Long parkingInfo);
}
