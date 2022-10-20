package com.ydcelad.intelligentizecarsystem.service.Impl;

import cn.hutool.log.Log;
import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.entity.FireUser;
import com.ydcelad.intelligentizecarsystem.entity.User;
import com.ydcelad.intelligentizecarsystem.entity.UserDto;
import com.ydcelad.intelligentizecarsystem.exception.ServiceException;
import com.ydcelad.intelligentizecarsystem.mapper.UserMapper;
import com.ydcelad.intelligentizecarsystem.service.UserService;
import com.ydcelad.intelligentizecarsystem.utils.TokenUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yindc
 * @since 2022-04-17
 * extends ServiceImpl<UserMapper,User>
 */
@Service
public class UserServiceImpl  implements UserService {

    private static final Log LOG = Log.get();

    @Resource
    private  UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findall();
    }

    @Override
    public int saveUser(List<User> list) {
        return userMapper.saveUser(list);
    }

    @Override
    public UserDto login(UserDto userDto) {
          Integer user;
        try{
            user = userMapper.login(userDto);
        }catch (Exception e){
            LOG.error(e);
            throw new ServiceException(Constants.CODE_500,"系统错误");
        }
        if(user == 1 ){

            User users = userMapper.findByUsernamePassword(userDto);
            String token = TokenUtils.getToken(users.getId().toString(),users.getPassword());
            userDto.setToken(token);
            return userDto;
        }else {
            throw  new ServiceException(Constants.CODE_600,"用户名或密码异常");
        }
    }

    @Override
    public User getById(String id) {
        return userMapper.getById(id);
    }

    @Override
    public FireUser xclogin(FireUser fireUser) {
        Integer user;
        try{
            user = userMapper.xclogin(fireUser);
        }catch (Exception e){
            LOG.error(e);
            throw new ServiceException(Constants.CODE_500,"系统错误");
        }
        if(user == 1 ){
            FireUser users = userMapper.findByXcUsernamePassword(fireUser);
            String token = TokenUtils.getToken(users.getId().toString(),users.getPassword());
            fireUser.setToken(token);
            fireUser.setIsStaff(users.getIsStaff());
            return fireUser;
        }else {
            throw  new ServiceException(Constants.CODE_600,"用户名或密码异常");
        }
    }
}
