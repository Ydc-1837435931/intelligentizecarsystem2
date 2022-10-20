package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
public class FireOneForm {

    private Long id;

    private Integer radio;

    private String questionitem;

    private String controlmeasures;

    private String responsibleunit;

    private String developmentperson;

    private String businessperson;

    private Long merchantsId;

    private String merchantName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plandate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private String percentage;

    private String percenpagedescribe;

}
