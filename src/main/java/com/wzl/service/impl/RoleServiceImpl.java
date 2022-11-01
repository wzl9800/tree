package com.wzl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.RoleDao;
import com.wzl.domain.Role;
import com.wzl.service.RoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 16:18
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao,Role> implements RoleService {

    @Resource
    private RoleDao roleDao;

    /*//按条件查询
    @Override
    public List<Role> queryCondition(String condition) {
        LambdaQueryWrapper<Role> lqw = new LambdaQueryWrapper<>();
        lqw.like(condition != null,Role::getCreateTime,condition);
        return roleDao.selectList(lqw);
    }
    @Override
    public void selectAll() {
        List<Role> list = this.list(null);
    }
    @Override
    public IPage<Role> selectPage(Integer currentPage, Integer pageSize) {
        IPage<Role> page = new Page<>(currentPage,pageSize);
        LambdaQueryWrapper<Role> lqw = new LambdaQueryWrapper<>();
        return roleDao.selectPage(page,null);
    }*/


}
