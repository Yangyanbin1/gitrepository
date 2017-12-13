package com.jnmd.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.ssm.domain.User;
import com.jnmd.ssm.service.UserService;

@Controller
@Scope("prototype")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUsers")
    public ModelAndView getUsers() {

        List<User> users = userService.getUsers();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("userList");

        mv.addObject("users", users);
        return mv;
    }

    @RequestMapping("/{uid}/getUser")
    public ModelAndView getUser(@PathVariable("uid") int id) {

        User user = userService.getUser(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userInfo");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping("/saveController")
    public String save() {
        return "forward:/WEB-INF/jsp/saveUser.jsp";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) {

//         validate...

        userService.saveUser(user);
        return "forward:/WEB-INF/jsp/saveSucc.jsp";

    }

}
