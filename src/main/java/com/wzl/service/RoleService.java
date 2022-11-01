package com.wzl.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wzl.domain.Role;
import io.swagger.models.auth.In;

import java.awt.print.Book;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 16:18
 */
public interface RoleService extends IService<Role> {

   /* //条件查询
    List<Role> queryCondition(String condition);
    void selectAll();
    //分页
    IPage<Role> selectPage(Integer currentPage, Integer pageSize);
    //IPage<Role> selectPageCondition(Integer currentPage, Integer pageSize,Role role);*/
}
