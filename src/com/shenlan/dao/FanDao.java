package com.shenlan.dao;

import com.shenlan.entity.Fan_of_user;

import java.util.List;

/**
 * 关注表.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public interface FanDao {
    Fan_of_user getFanById(int id);
    List<Fan_of_user> getFans();
    List<Fan_of_user> getFollows();
    int createFan();
    int addFan(Fan_of_user fan);//关系到两张表
    int deleteFan(Fan_of_user fan);//关系到两张表
}
