package com.wzl.domain;


import com.baomidou.mybatisplus.annotation.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("bnz_user")
public class User {
    @TableId
    private Integer userId;
    private String userName;
    private String passWord;
    @TableField(value = "nick_name")
    private String nick_name;
    private String email;
    private String mobile;
    private String status;

    private Integer createUserId;
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)//自动填充的第一步
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @TableLogic//逻辑删除要添加的
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    @Version//乐观锁
    @TableField(fill = FieldFill.INSERT )
    private Integer version;

}
