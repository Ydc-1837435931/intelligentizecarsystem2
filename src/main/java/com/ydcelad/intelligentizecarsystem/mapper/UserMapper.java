package com.ydcelad.intelligentizecarsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ydcelad.intelligentizecarsystem.entity.FireUser;
import com.ydcelad.intelligentizecarsystem.entity.User;
import com.ydcelad.intelligentizecarsystem.entity.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yindc
 * @since 2022-04-17
 */
@Mapper
public interface UserMapper {

    public User getById(String id);

    public List<User> findall();

    public Integer save();

    public int saveUser(List<User> list);

    public Integer login(UserDto userDto);

    public User findByUsernamePassword(UserDto userDto);

    Integer xclogin(FireUser fireUser);

    FireUser findByXcUsernamePassword(FireUser fireUser);

    FireUser getXcById(String id);
}
