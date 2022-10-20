package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.ydcelad.intelligentizecarsystem.entity.noticeInfo;
import com.ydcelad.intelligentizecarsystem.mapper.noticeInfoMapper;
import com.ydcelad.intelligentizecarsystem.service.INoticeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NoticeInfoServiceImpl implements INoticeInfoService {

    @Resource
    private com.ydcelad.intelligentizecarsystem.mapper.noticeInfoMapper noticeInfoMapper;

    @Override
    public List<noticeInfo> getlist(noticeInfo noticeInfo) {
        return noticeInfoMapper.getList(noticeInfo);
    }
}
