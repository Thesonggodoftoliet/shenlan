package com.shenlan.dao;

import com.shenlan.entity.User_account;

import java.util.List;

/**
 * 基础用户数据库操作.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public interface UserDao {
    User_account getUserByAccount(String account);
    List<User_account> getAllUser();
    User_account getUserByPhone(String phone);
    int addUser(User_account newuser);
    int alterUser(User_account user);
}
