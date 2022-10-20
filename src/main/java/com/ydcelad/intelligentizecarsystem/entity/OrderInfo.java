package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderInfo {

    private Long orderid;

    private String platenumber;

    private Long platepay;

    private Long platetime;

    private Date plateintime;

    private Date plateoutime;

    private String platepaytype;


}
