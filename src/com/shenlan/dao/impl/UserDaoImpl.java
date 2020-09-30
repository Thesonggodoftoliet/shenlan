package com.shenlan.dao.impl;

import com.shenlan.dao.UserDao;
import com.shenlan.entity.User_account;
import com.shenlan.utils.JdbcUtils;

import java.util.List;

/**
 * 请在这里填写描述.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public class UserDaoImpl implements UserDao {

    /**
      *通过账号获取用户.
      * @param account
      * @return com.shenlan.entity.User_account
      **/
    @Override
    public User_account getUserByAccount(String account) {
        String sql = "select * form user_account where user_account = ?";
        return (User_account) JdbcUtils.getObjectById(User_account.class,sql,account);
    }

    /**
      *获取所有用户.
      * @return java.util.List<com.shenlan.entity.User_account>
      **/
    @Override
    public List<User_account> getAllUser() {
        String sql = "select * form user_account";
        return JdbcUtils.getList(User_account.class,sql);
    }

    /**
      *通过手机号获取用户.
      * @param phone
      * @return com.shenlan.entity.User_account
      **/
    @Override
    public User_account getUserByPhone(String phone) {
        String sql = "select * from user_account where user_phone = ?";
        return (User_account) JdbcUtils.getObjectById(User_account.class,sql,phone);
    }

    /**
      *添加新的用户成员.
      * @param newuser
      * @return int
      **/
    @Override
    public int addUser(User_account newuser) {
        String sql = "insert into user_account values(?,?,?,?,?,?,?,?)";
        return JdbcUtils.executeSQL(sql,newuser.getUser_account(),newuser.getUser_password(),newuser.getUser_phone(),newuser.getUser_wechat(),newuser.getUser_name(),newuser.getUser_gender(),newuser.getUser_birth(),newuser.getUser_identity());
    }

    /**
      *修改用户信息.
      * @param user
      * @return int
      **/
    @Override
    public int alterUser(User_account user) {
        String sql = "update user_account where user_account = ? set user_password = ?,user_phone=?,user_wechat=?,user_name=?,user_gender=?,user_birth=?,user_identity=?";
        return JdbcUtils.executeSQL(sql,user.getUser_account(),user.getUser_password(),user.getUser_phone(),user.getUser_wechat(),user.getUser_name(),user.getUser_gender(),user.getUser_birth(),user.getUser_identity());
    }
}
