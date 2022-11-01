package com.wzl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.RoleMenuDao;
import com.wzl.domain.RoleMenu;
import com.wzl.service.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author wangzhilong
 * @dcreate 2022-02-28 9:42
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuDao,RoleMenu> implements RoleMenuService {

    @Resource
    private RoleMenuDao roleMenuDao;


}
