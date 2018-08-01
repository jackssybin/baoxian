package com.kaisagroup.baoxian.controller;

import com.kaisagroup.baoxian.entity.BaoXian;
import com.kaisagroup.baoxian.entity.ChanXian;
import com.kaisagroup.baoxian.entity.ShouXian;
import com.kaisagroup.baoxian.entity.User;
import com.kaisagroup.baoxian.service.BaoXioanService;
import com.kaisagroup.baoxian.service.UserService;
import com.kaisagroup.baoxian.util.Constants;
import com.kaisagroup.baoxian.util.LayuiData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 创建人：thj
 * 创建时间： 2018/6/26 10:06
 * 用途：
 */
@Controller
@RequestMapping("/baoxian")
public class BaoXianController {
    @Autowired
    private UserService userService;

    @Autowired
    private BaoXioanService baoXioanService;


    @RequestMapping("/list")
    public String userList1() {

        return "baoxian/listPage";
    }












    /***
     * ******************************************************************* ******************************************************************
     * * ******************************************************************* ******************************************************************
     */


    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public LayuiData getUserList (HttpServletRequest request){
        String name = request.getParameter("name");
        if(name==null){
            name="";
        }
        String pageStr =request.getParameter("page");
        if(StringUtils.isEmpty(pageStr)){
            pageStr="1";
        }
        String limitStr =request.getParameter("limit");
        if(StringUtils.isEmpty(limitStr)){
            limitStr="10";
        }
        int page = Integer.parseInt(pageStr);
        int limit = Integer.parseInt(limitStr);
        if(page>=2){
            page = (page-1)*limit;
        }
        LayuiData layuiData = new LayuiData();
        List<User> userList = userService.getUserList(name,page,limit);
        int count = userService.getUserCount();
        layuiData.setCode(0);
        layuiData.setCount(count);
        layuiData.setMsg("数据请求成功");
        layuiData.setData(userList);
       return layuiData;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String add (@RequestBody User user){

            int orderId = userService.add(user);

         return "";
    }



    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Integer delete(Integer id) {

       int num = userService.delete(id);

        return num;
    }

    /**
     * 去查看界面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toDetail")
    public String toDetail(Integer id, Model model) {

        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }

    /**
     * 根据id修改用户信息
     * @return
     */
    @RequestMapping("/userUpdate")
    @Transactional
    @ResponseBody
    public Integer userUpdate (Integer id,String name,Integer age){
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setId(id);
        int num = userService.update(user);
        return num;
    }
}
