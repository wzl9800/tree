package com.wzl.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangzhilong
 * @dcreate 2022-02-28 9:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bnz_user_role")
public class UserRole {

    @TableId
    private Integer id;
    private Integer userId;
    private Integer roleId;
}
