package com.wzl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.UserRoleDao;
import com.wzl.domain.UserRole;
import com.wzl.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangzhilong
 * @dcreate 2022-02-28 9:47
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;
}
