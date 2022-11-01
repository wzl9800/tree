package com.wzl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzl.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:10
 */
@Repository
@Mapper
public interface UserDao extends BaseMapper<User> {
}
