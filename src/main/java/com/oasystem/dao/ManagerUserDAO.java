package com.oasystem.dao;

import com.oasystem.pojo.User;

import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
public interface ManagerUserDAO {

    /**
     * 获取所有人
     * @return
     */
    public List<User> getALLUser();
}
