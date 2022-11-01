package com.wzl.controller;

import com.wzl.domain.Menu;
import com.wzl.service.MenuService;
import com.wzl.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * @author wangzhilong
 * @dcreate 2022-02-28 9:19
 */
@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/get")
    public R threeTree(){
        ArrayList<Menu> all = menuService.findAll();
        return R.ok().data("menus",all);
    }

//   查找全部  分页  模糊查询

    @DeleteMapping("/delectAll/{menuId}")
    public R delectAll(@PathVariable Integer menuId){
        if (menuService.delectAll(menuId)!=0){
            return R.ok();
        }
        return R.error();
//        ArrayList menus = menuService.delectAll(menuId);
//        boolean b = menuService.removeById(menuId);
//        if(b) {
//            Iterator<Iterator> iterator = menus.iterator();
//            while (iterator.hasNext()) {
//                menuService.removeById((Serializable) iterator.next());
//            }
//        }
//        return b?R.ok():R.error();
    }

    @PutMapping("/modify")
    public R modify(@RequestBody Menu menu){
        return menuService.updateById(menu)?R.ok():R.error();
    }

    @PostMapping("/push")
    public R insertMenu(@RequestBody Menu menu){
        return menuService.save(menu)?R.ok():R.error();
    }
}
