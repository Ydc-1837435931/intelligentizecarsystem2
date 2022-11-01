package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class ProjectDetail {

    private Date plantime1;

    private Date plantime2;

    private Date plantime3;

    private Integer bishenbiyan;

    private Integer yaoqiuyangpingpai;

    private Integer others;

}
