package com.ydcelad.intelligentizecarsystem.controller;

import cn.hutool.core.util.StrUtil;
import com.ydcelad.intelligentizecarsystem.common.Constants;
import com.ydcelad.intelligentizecarsystem.common.Result;
import com.ydcelad.intelligentizecarsystem.config.AuthAccess;
import com.ydcelad.intelligentizecarsystem.entity.FireUser;
import com.ydcelad.intelligentizecarsystem.entity.UserDto;
import com.ydcelad.intelligentizecarsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userlogin")
public class login {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody UserDto userDto){
        String username = userDto.getUsername();
        String password = userDto.getPassword();
        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
            return Result.error(Constants.CODE_400,"参数错误");
        }
        UserDto dto = userService.login(userDto);
        return Result.success(dto);
    }


    @PostMapping("/xclogin")
    public Result xclogin(@RequestBody FireUser fireUser){
        String username = fireUser.getUsername();
        String password = fireUser.getPassword();
        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
            return Result.error(Constants.CODE_400,"参数错误");
        }
        FireUser dto = userService.xclogin(fireUser);
        return Result.success(dto);
    }
}
