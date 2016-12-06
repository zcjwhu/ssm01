package com.ajin.controller;

import com.ajin.model.User;
import com.ajin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ajin on 16-12-5.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

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
