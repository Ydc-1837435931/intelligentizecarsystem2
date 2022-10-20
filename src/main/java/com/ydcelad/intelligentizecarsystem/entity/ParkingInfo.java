package com.ydcelad.intelligentizecarsystem.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ApiModel(value = "ParkingInfo对象", description = "")
@ToString
public class ParkingInfo {

    /** ID */
    @ApiModelProperty("ID")
    @TableId(value = "parkinid", type = IdType.AUTO)
    @Alias("parkinid")
    private Long parkinid;

    /** 停车场名称 */
    @ApiModelProperty("停车场名称")
    @TableId(value = "parkingname", type = IdType.AUTO)
    @Alias("parkingname")
    private String parkingname;

    /** 停车场联系人 */
    @ApiModelProperty("停车场联系人")
    @TableId(value = "parkinglinkman", type = IdType.AUTO)
    @Alias("parkinglinkman")
    private String parkinglinkman;

    /** 停车场联系电话 */
    @ApiModelProperty("停车场联系电话")
    @TableId(value = "parkingphone", type = IdType.AUTO)
    @Alias("parkingphone")
    private String parkingphone;

    /** 停车场地址 */
    @ApiModelProperty("停车场地址")
    @TableId(value = "parkingaddress", type = IdType.AUTO)
    @Alias("parkingaddress")
    private String parkingaddress;

    /** 停车场加密 */
    @ApiModelProperty("停车场加密")
    @TableId(value = "parkingencrypt", type = IdType.AUTO)
    @Alias("parkingencrypt")
    private String parkingencrypt;

    /** 停车场网址 */
    @ApiModelProperty("停车场网址")
    @TableId(value = "parkingweburl", type = IdType.AUTO)
    @Alias("parkingweburl")
    private String parkingweburl;

    /** 停车场网址端口 */
    @ApiModelProperty("停车场网址端口")
    @TableId(value = "parkingurlport", type = IdType.AUTO)
    @Alias("parkingurlport")
    private String parkingurlport;

    /** 停车场网址信息 */
    @ApiModelProperty("停车场网址信息")
    @TableId(value = "parkinginfoweburl", type = IdType.AUTO)
    @Alias("parkinginfoweburl")
    private String parkinginfoweburl;

    /** 停车场备注 */
    @ApiModelProperty("停车场备注")
    @TableId(value = "parkingremark", type = IdType.AUTO)
    @Alias("parkingremark")
    private String parkingremark;

    /** 是否支持无牌进出 */
    @ApiModelProperty("是否支持无牌进出")
    @TableId(value = "parkingwupaienable", type = IdType.AUTO)
    @Alias("parkingwupaienable")
    private String parkingwupaienable;

    /** 是否支持手机支付 */
    @ApiModelProperty("是否支持手机支付")
    @TableId(value = "parkingphonepay", type = IdType.AUTO)
    @Alias("parkingphonepay")
    private String parkingphonepay;

    /** 是否支持遥感识别 */
    @ApiModelProperty("是否支持遥感识别")
    @TableId(value = "parkingcarpay", type = IdType.AUTO)
    @Alias("parkingcarpay")
    private String parkingcarpay;
}
