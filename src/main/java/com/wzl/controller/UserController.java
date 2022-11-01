package com.wzl.controller;



import com.wzl.dao.UserDao;
import com.wzl.domain.User;
import com.wzl.service.UserService;
import com.wzl.utils.MD5Util;
import com.wzl.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author wangzhilong
 * @dcreate 2022-02-26 15:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    //根据id查数据
    @GetMapping("/save/{id}")
    public R insertUser(@PathVariable Integer id){
        return R.ok().data("users",userService.getById(id));
    }

    //删除数据（方法返回值为boolean类型）
    @DeleteMapping("/delect/{id}")
    public R delectById(@PathVariable Integer id){
        return userDao.deleteById(id) > 0? R.ok() : R.error();
    }

    //修改数据
    @PutMapping("/modify")
    public R modifyById(@RequestBody User user){
        MD5Util md5 = new MD5Util();
        user.setPassWord(md5.getMD5(user.getPassWord()));
        boolean b = userService.updateById(user);
        return b?R.ok():R.error();
    }

    //插入数据
    @PostMapping("/insert")
    public R insertUser(@RequestBody User user){
        MD5Util md5 = new MD5Util();
        user.setPassWord(md5.getMD5(user.getPassWord()));
        boolean save = userService.save(user);
        return save?R.ok():R.error();
    }

    /*@GetMapping("/san")
    public R pushAll(@RequestParam Map<String,Object> map){
        List<User> users = userService.selectForPage(map);
        return R.ok().data("user",users);
    }*/
   /* //分页
    @GetMapping("{currentPage}/{pageSize}")
    public R selectCondition(@PathVariable int currentPage, @PathVariable int pageSize){
        return R.ok().data("users",userService.queryPage(currentPage,pageSize));
    }
    //查询所有数据
    @GetMapping("/selAll")
    public R selectAll(){
        return R.ok().data("users",userService.list());
    }
    //条件查询
    @GetMapping("/cdt/{condition}")
    public R selectCondition(@PathVariable String condition){
        return R.ok().data("users",userService.condition(condition));
    }*/

}
