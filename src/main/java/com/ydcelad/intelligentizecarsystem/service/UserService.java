package com.ydcelad.intelligentizecarsystem.service;

import com.ydcelad.intelligentizecarsystem.entity.FireUser;
import com.ydcelad.intelligentizecarsystem.entity.User;
import com.ydcelad.intelligentizecarsystem.entity.UserDto;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yindc
 * @since 2022-04-17
 */
public interface UserService  {

        List<User> findAll();

        public int saveUser(List<User> list);

    UserDto login(UserDto userDto);

        User getById(String id);

    FireUser xclogin(FireUser fireUser);

    FireUser geXcByid(String id);
}
