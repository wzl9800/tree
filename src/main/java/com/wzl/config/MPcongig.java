package com.wzl.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhilong
 * @dcreate 2022-02-14 14:18
 */
//分页功能用的拦截器（mybatis-plus）
@Configuration
@MapperScan("com.wzl.dao")//注意这个
public class MPcongig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

    //乐观锁插件的配置
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInnerInterceptor();
    }

    //逻辑删除的插件（现在mybatis-plus的版本不用写）
    /*@Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }*/
}
