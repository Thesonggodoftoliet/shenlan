package com.shenlan.entity;

import java.sql.Date;

/**
 * 用户账户普通信息.
 *
 * @author Marting.Lee
 * 2020/9/28
 */
public class User_account {
    private String user_account;
    private String user_password;
    private String user_phone;
    private String user_wechat;
    private String user_name;
    private int user_gender;//0 为 男，1 为 女
    private Date user_birth;
    private int user_identity;//0 为 普通用户，1 为 画师

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_wechat() {
        return user_wechat;
    }

    public void setUser_wechat(String user_wechat) {
        this.user_wechat = user_wechat;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(int user_gender) {
        this.user_gender = user_gender;
    }

    public Date getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(Date user_birth) {
        this.user_birth = user_birth;
    }

    public int getUser_identity() {
        return user_identity;
    }

    public void setUser_identity(int user_identity) {
        this.user_identity = user_identity;
    }
}
