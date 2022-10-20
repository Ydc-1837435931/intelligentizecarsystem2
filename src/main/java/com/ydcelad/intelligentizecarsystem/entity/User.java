package com.ydcelad.intelligentizecarsystem.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author yindc
 * @since 2022-04-17
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "User对象", description = "")
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
      @Alias("ID")
      private Integer id;

      @ApiModelProperty("用户名")
      @TableId(value = "username", type = IdType.AUTO)
      @Alias("username")
      private String username;

      @ApiModelProperty("密码")
      @TableId(value = "password", type = IdType.AUTO)
      @Alias("password")
      private String password;

      @ApiModelProperty("昵称")
      @Alias("nickname")
      private String nickname;

      @ApiModelProperty("邮箱")
      @Alias("email")
      private String email;

      @ApiModelProperty("电话")
      @Alias("phone")
      private String phone;

      @ApiModelProperty("地址")
      @Alias("address")
      private String address;

      @ApiModelProperty("创建时间")
      @Alias("createTime")
      private LocalDateTime createTime;

      @ApiModelProperty("头像")
      @Alias("头像")
      private String avatarUrl;

}
