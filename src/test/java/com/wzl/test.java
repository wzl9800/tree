package com.wzl;

import com.wzl.dao.UserDao;
import com.wzl.domain.Menu;
import com.wzl.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:49
 */
@SpringBootTest
public class test {
    @Autowired
    private MenuService menuService;
    @Test
    public void getByid(){
        //ArrayList<Menu> all = menuService.findAll();
       // System.out.println(all);
    }


}
