package com.sunshine.service.com.sunshine.service.impl;


import com.sunshine.dao.UserDao;
import com.sunshine.model.UserInfo;
import com.sunshine.service.com.sunshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gwh1994 on 2017/7/1.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public UserInfo selectUserInfoForRegister(UserInfo userInfo){
        return userDao.selectUserInfoForRegister(userInfo);

    }
}
