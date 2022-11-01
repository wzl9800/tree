package com.wzl.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangzhilong
 * @dcreate 2022-02-28 9:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bnz_role_menu")
public class RoleMenu {

    private Integer id;
    private Integer roleId;
    private Integer menuId;
}
