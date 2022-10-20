package com.ydcelad.intelligentizecarsystem.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import java.util.Date;

@Data
public class FireUser {

    private Long id;

    private String password;

    private Date lastLogin;

    private Integer isSuperuser;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private Integer isStaff;

    private Integer isActive;

    private Date dateJoined;

    private String token;

}
