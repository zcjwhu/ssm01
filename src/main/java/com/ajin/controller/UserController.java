package com.ajin.controller;

import com.ajin.model.User;
import com.ajin.service.UserService;
import com.ajin.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ajin on 16-12-5.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/doLogin")
    //方法三
    public ModelAndView doLogin(UserVo userVo){
        User user =userService.selectUserByName(userVo.getUsername());
        ModelAndView modelAndView = new ModelAndView();
        if(user.getPassword().equals(userVo.getPassword())){
            modelAndView.addObject("user",user);
            modelAndView.setViewName("main");
        }else{

        }
        return modelAndView;
    }
    //方法二
//    public ModelAndView doLogin(HttpServletRequest request){
//        User user =userService.selectUserByName(request.getParameter("username"));
//        ModelAndView modelAndView = new ModelAndView();
//        if(user.getPassword().equals(request.getParameter("password"))){
//            modelAndView.addObject("user",user);
//            modelAndView.setViewName("main");
//        }else{
//
//        }
//        return modelAndView;
//    }
    //方法一
//    public ModelAndView doLogin(String username,String password){
//        User user =userService.selectUserByName(username);
//        ModelAndView modelAndView = new ModelAndView();
//        if(user.getPassword().equals(password)){
//            modelAndView.addObject("user",user);
//            modelAndView.setViewName("main");
//        }else{
//
//        }
//        return modelAndView;
//    }

    @RequestMapping("/selectUserById")
    public ModelAndView selectUserById(){
        int id=2;
        User user = userService.selectUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user/getUser");
        return modelAndView;
    }

    @RequestMapping("/deleteUserById")
    public ModelAndView deleteUserById(){
        userService.deleteUserById(1);
        return null;
    }
}
