package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;


/**
* *接受前端接受的数据
* */
@Data
public class UserDto {

    private String username;

    private String password;

    private String nickname;

    private String avatarUrl;

    private String token;
}
