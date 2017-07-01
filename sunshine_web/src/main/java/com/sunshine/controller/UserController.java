package com.sunshine.controller;

import com.sunshine.model.UserInfo;
import com.sunshine.service.com.sunshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gwh1994 on 2017/7/1.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{username}/{telephone}")
    public UserInfo register(@PathVariable String username, @PathVariable String telephone){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setTelephone(telephone);
        UserInfo user = userService.selectUserInfoForRegister(userInfo);
        return user;
    }

}
