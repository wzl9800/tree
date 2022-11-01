package com.wzl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.UserDao;
import com.wzl.domain.User;
import com.wzl.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Resource
    private UserDao userDao;

   /* @Override
    public List<User> selectForPage(Map<String, Object> map) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        IPage<User> page = new Page<>(map.get("current"),map.get("page"));
        Page<User> userPage = new Page<>((Integer)map.get("current"),(Integer)map.get("page"));
        wrapper.like("")
        if(lqw != null){
            this.baseMapper.selectList(lqw);
        }else if(Strings.isNotEmpty((CharSequence) userPage)){
            this.baseMapper.selectPage(userPage,null);
        }else if(lqw != null&& Strings.isNotEmpty((CharSequence) userPage )){
            this.baseMapper.selectPage(userPage, lqw);
        }else {
            this.baseMapper.selectList(null);
        }
        this.baseMapper.selectPage(userPage,lqw);
       *//* String key = map.get("key").toString();
        System.out.println(key);*//*
        return null;
    }
*/


   /* @Override
    public List<User> condition(String condition) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(condition != null,User::getStatus,condition);
        return userDao.selectList(lqw);
    }
    @Override
    public IPage<User> queryPage(Integer currentPage, Integer pageSize) {
        IPage<User> page = new Page<>(currentPage,pageSize);
        return userDao.selectPage(page,null);
    }*/
}