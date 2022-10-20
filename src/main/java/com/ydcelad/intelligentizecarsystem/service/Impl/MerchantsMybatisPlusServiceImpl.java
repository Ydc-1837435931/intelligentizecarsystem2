package com.ydcelad.intelligentizecarsystem.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.TopicCondition;
import com.ydcelad.intelligentizecarsystem.mapper.MerchantsMybatisPlusMapper;
import com.ydcelad.intelligentizecarsystem.service.IMerchantsMybatisPlusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class MerchantsMybatisPlusServiceImpl implements IMerchantsMybatisPlusService {

    @Resource
    private MerchantsMybatisPlusMapper merchantsMybatisPlusMapper;

    public IPage<FireMerchant> queryByCondition(TopicCondition con){
        Page<FireMerchant> page = new Page<>();
        page.setCurrent(con.getPageNo());
        page.setSize(con.getPageSize());
        QueryWrapper<FireMerchant>  qw = new QueryWrapper<>();
        if(con.getTopicName() != null && !con.getTopicName().isEmpty()){
            qw.like("topic",con.getTopicName());
        }
        return merchantsMybatisPlusMapper.selectPage(page,qw);
    }
}
