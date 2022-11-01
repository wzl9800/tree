package com.wzl.controller;

import com.wzl.dao.RoleDao;
import com.wzl.domain.Role;
import com.wzl.exceptionHandler.GlobalException;
import com.wzl.service.RoleService;
import com.wzl.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author wangzhilong
 * @dcreate 2022-02-26 16:25
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleDao roleDao;

    @Autowired
    private RoleService roleService;
    //根据id查询数据
    @GetMapping("/save/{id}")
    public R getById(@PathVariable Integer id){
        System.out.println(id);
        Role byId = roleService.getById(id);
//        System.out.println(byId);byId
        return R.ok().data("roles",roleService.getById(id));
    }

//删除数据
    @DeleteMapping("/del/{id}")
    public R delectRole(@PathVariable Integer id){
        /*if(roleService.removeById(id)){
            return R.ok();
        }else {
            return R.error();
        }*/
        return roleDao.deleteById(id) > 0 ? R.ok() : R.error();
    }
//修改数据
    @PutMapping("/mod")
    public R modify(@RequestBody Role role){
        return roleService.updateById(role)?R.ok():R.error();
    }

    //插入数据
    @PostMapping("/push")
    public R pushRole(@RequestBody  Role role){
        return roleService.save(role)?R.ok():R.error();
    }

   /* //按条件查询
    @GetMapping("/condition/select/{condition}")
    public R condition(@PathVariable String condition){
        return R.ok().data("roles",roleService.queryCondition(condition));
    }
    //查询所有数据
    @GetMapping("/all")
    public R selectAll(){
//      List<Role> list = .list();
        return R.ok().data("roles",roleService.list());
    }
    //分页
    @GetMapping("/pop/{currentPage}/{pageSize}")
    public R popPage(Integer currentPage,Integer pageSize){
        //int i = 10/0;
        try {
            int i = 10/0;
        }catch (Exception e){
            throw new GlobalException(20001,"执行了自定义异常");
        }
         return R.ok().data("roles",roleService.selectPage(currentPage,pageSize));
    }*/

}
