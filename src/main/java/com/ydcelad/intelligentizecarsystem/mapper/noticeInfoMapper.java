package com.ydcelad.intelligentizecarsystem.mapper;

import com.ydcelad.intelligentizecarsystem.entity.noticeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface noticeInfoMapper {

    List<noticeInfo> getList(noticeInfo noticeInfo);
}
