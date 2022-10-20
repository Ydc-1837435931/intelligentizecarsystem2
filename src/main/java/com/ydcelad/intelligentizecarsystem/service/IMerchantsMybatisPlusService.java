package com.ydcelad.intelligentizecarsystem.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ydcelad.intelligentizecarsystem.entity.FireMerchant;
import com.ydcelad.intelligentizecarsystem.entity.TopicCondition;

public interface IMerchantsMybatisPlusService {

    public IPage<FireMerchant> queryByCondition(TopicCondition con);
}
