package com.ydcelad.intelligentizecarsystem.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
@TableName(value = "fire_merchant")
public class FireMerchant {

    @TableId("merchantno")
    private Long merchantno;

    @TableField(exist = false)
    private Long projectid;

    @TableField(exist = false)
    private String projectname;

    private Long type;

    @TableField("merchant_type")
    private Integer merchantType;

    private Double area;

    @TableField(exist = false)
    private String merchantName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plantime1;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plantime2;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plantime3;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time1;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time2;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time3;


}
