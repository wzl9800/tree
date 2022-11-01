package com.wzl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzl.dao.MenuDao;
import com.wzl.domain.Menu;
import com.wzl.service.MenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-26 17:38
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

    @Resource
    private MenuDao menuDao;
    @Override
    public ArrayList<Menu> findAll(){
        ArrayList<Menu> menus = new ArrayList<>();
        List<Menu> list = this.list(null);
        for (Menu menu : list) {
            //parent_id=0就是根类（才有子类）
            if (menu.getParentId()==0){
                // 找子类
                List<Menu> childrenData = getChildrenData(menu.getMenuId(), list);
                menu.setChildren(childrenData);
                menus.add(menu);
            }
        }
        return menus;
    }

    private List<Menu> getChildrenData(Integer menuId, List<Menu> list) {
        ArrayList<Menu> menus = new ArrayList<>();
        for (Menu menu : list) {
            if (menu.getParentId().equals(menuId)){
                // 找子类
                List<Menu> childrenData = getChildrenData(menu.getMenuId(), list);
                menu.setChildren(childrenData);
                menus.add(menu);
             }
        }
        return menus;
    }


    //删除父类,子类也要级联删除
    @Override
    public Integer delectAll(Integer menuId){
        Integer flag = 0;
        List<Integer> IdLists = new ArrayList<>();
        IdLists.add(menuId);
        List<Menu> list = this.list(null);
        for (Menu menu : list) {
            if (menu.getParentId()==menuId){
                IdLists.add(menu.getMenuId());//少了这个
                // 找子类
                List<Menu> childrenData = getChildrenData(menu.getMenuId(),list);
                if (childrenData.size()!=0){
                    for (Menu childrenDatum : childrenData) {
                        IdLists.add(childrenDatum.getMenuId());
                    }
                }
            }
        }
        System.out.println(IdLists);
        if (IdLists.size()==1){
//            menuService ---- this
//            menuDao  -----  this.baseMapper
//            删除单号
//            menuDao.deleteById(IdLists.get(0));
            flag = this.baseMapper.deleteById(IdLists.get(0));
        }else {
            flag = this.baseMapper.deleteBatchIds(IdLists);
        }

        return flag;
    }

//    private List delectChildrenData(Integer menuId, List<Menu> list) {
//        ArrayList menus = new ArrayList();
//        for (Menu menu : list) {
//            if (menu.getParentId().equals(menuId)){
//                // 找子类
//                List<Menu> childrenData = delectChildrenData(menu.getMenuId(), list);
//                menu.setChildren(childrenData);
//                menus.add(menu.getMenuId());
//            }
//        }
//        return menus;
//    }

    //修改数据
}
