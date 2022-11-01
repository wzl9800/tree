package com.wzl.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wzl.domain.User;

import java.util.List;
import java.util.Map;


/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:10
 */
public interface UserService extends IService<User> {

    //查全部数据  分页  条件查询
    //List<User> selectForPage(Map<String,Object> map);

    /*//分页
   IPage<User> queryPage(Integer currentPage, Integer pageSize);
    //按条件查询
    List<User>  condition(String condition);*/
}
