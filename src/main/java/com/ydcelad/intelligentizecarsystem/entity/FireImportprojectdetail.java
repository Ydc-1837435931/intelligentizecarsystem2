package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class FireImportprojectdetail {

    private Long importprojectId;

    private Long projectId;

    private String plazaname;

    private String domin;

    private String detail;

    private Long isImport;

    private Date createDate;

    private String createPerson;

    private int avaiable;
}
