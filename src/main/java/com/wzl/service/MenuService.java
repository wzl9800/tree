package com.wzl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzl.domain.Menu;

import java.util.ArrayList;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 17:37
 */
public interface MenuService extends IService<Menu> {

    ArrayList<Menu> findAll();

    //三级树全删
    Integer delectAll(Integer menuId);


}
