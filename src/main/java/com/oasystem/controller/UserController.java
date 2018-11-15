package com.oasystem.controller;

import com.oasystem.dao.ManagerUserDAO;
import com.oasystem.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zyf on 2018/10/16.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="managerUserDAO")
    private ManagerUserDAO  managerUserDAO;

    @RequestMapping(value="/showAllList",method=RequestMethod.GET)
    public @ResponseBody List<User> getAllUser(){

        List<User> userList=managerUserDAO.getALLUser();

        return  userList;
    }
}

