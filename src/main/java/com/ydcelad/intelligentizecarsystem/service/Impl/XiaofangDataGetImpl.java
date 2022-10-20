package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.mapper.XiaofangDataGetMapper;
import com.ydcelad.intelligentizecarsystem.service.IXiaofangDataGetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class XiaofangDataGetImpl implements IXiaofangDataGetService {

    @Resource
    private XiaofangDataGetMapper xiaofangDataGetMapper;

    @Override
    public List getxiaofangzongshu() {
        List<Integer> list = new ArrayList<>();
        list.add(0,xiaofangDataGetMapper.getFireOneFormCount());
        list.add(1,xiaofangDataGetMapper.getFireTwoFormCount());
        list.add(2,xiaofangDataGetMapper.getFireThreeFormCount());
        return list;
    }
}
