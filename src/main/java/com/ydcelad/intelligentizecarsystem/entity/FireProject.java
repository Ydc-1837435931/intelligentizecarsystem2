package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class FireProject {

    private Long id;

    private String plaza;

    private Date creatdate;

    private String domain;

    private String describe1;

    private String describe2;

    private String describe3;

    private String plazaname;

    private Long zhaoshangst;

    private Long zhaoshangsj;

    private Long chutust;

    private Long chutusj;

    private Long xiaofangtust;

    private Long xiaofangtusj;

    private Long xiaofangzichast;

    private Long xiaofangzichasj;

    private Long xiaoyanst;

    private Long xiaoyansj;

    private Long kaiyejianst;

    private Long kaiyejiansj;
}
