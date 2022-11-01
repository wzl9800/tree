package com.wzl;

import com.wzl.dao.MenuDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManageApplicationTests {

    @Autowired
    private MenuDao menuDao;

    @Test
    void contextLoads() {
        int i = menuDao.deleteById(3);
        System.out.println(i);
    }

}
