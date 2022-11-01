package com.wzl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 17:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @TableId
    private Integer menuId;
    private Integer parentId;
    private String name;
    private String url;
    private String icon;

    //数据库底层没这个字段（要加的注释）
    @TableField(exist = false)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)//仅当属性为非null，或非默认值时，才应该包括该属性
    private List<Menu> children;


}
