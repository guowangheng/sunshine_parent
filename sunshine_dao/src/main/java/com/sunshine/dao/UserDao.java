package com.sunshine.dao;

import com.sunshine.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Guo.WangHeng on 2017/6/30.
 */
@Mapper
@Repository
public interface UserDao {

    UserInfo selectUserInfoForRegister(UserInfo userInfo);
}
