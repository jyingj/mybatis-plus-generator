package org.project.generator.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* User Entity
* @Author: jyj
* @Date: 2020-04-26
*/
@ApiModel(value="User Entity", description="")
@Data
@TableName("sys_user")
public class User implements Serializable {


    /**
    * 主键
    */
    @ApiModelProperty(value = "主键")
    @TableId("id")
    private Long id;

    /**
    * 用户名称
    */
    @ApiModelProperty(value = "用户名称")
    @TableField("user_name")
    private String userName;

    /**
    * 密码
    */
    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    /**
    * 密码盐
    */
    @ApiModelProperty(value = "密码盐")
    @TableField("salt")
    private String salt;

    /**
    * 姓名
    */
    @ApiModelProperty(value = "姓名")
    @TableField("name")
    private String name;

    /**
    * 手机号码
    */
    @ApiModelProperty(value = "手机号码")
    @TableField("mobile")
    private String mobile;

    /**
    * 邮箱
    */
    @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;

    /**
    * 备注
    */
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    /**
    * 用户类型
    */
    @ApiModelProperty(value = "用户类型")
    @TableField("user_type")
    private String userType;

    /**
    * 是否启用
    */
    @ApiModelProperty(value = "是否启用")
    @TableField("enabled")
    private Boolean enabled;

    /**
    * 是否是超级管理员
    */
    @ApiModelProperty(value = "是否是超级管理员")
    @TableField("is_admin")
    private Boolean isAdmin;

    /**
    * 是否删除
    */
    @ApiModelProperty(value = "是否删除")
    @TableField("is_delete")
    private Boolean isDelete;

    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

}
