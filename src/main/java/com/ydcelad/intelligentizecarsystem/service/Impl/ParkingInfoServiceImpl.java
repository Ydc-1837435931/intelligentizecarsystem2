package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.ParkingInfo;
import com.ydcelad.intelligentizecarsystem.mapper.ParkingInfoMapper;
import com.ydcelad.intelligentizecarsystem.service.IParkingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingInfoServiceImpl implements IParkingInfoService {

    @Autowired
    private ParkingInfoMapper parkingInfoMapper;

    @Override
    public List<ParkingInfo> selectParkingInfoList(ParkingInfo parkingInfo) {


        return parkingInfoMapper.selectParkingInfoList(parkingInfo);
    }

    @Override
    public ParkingInfo selectParkingById(Long parkinid) {
        return parkingInfoMapper.selectParkingById(parkinid);
    }
}
