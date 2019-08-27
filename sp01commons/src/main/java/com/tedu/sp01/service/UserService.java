package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * @author :mdzz
 * @description :
 * @date :2019/8/22 9:58
 */
public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}
