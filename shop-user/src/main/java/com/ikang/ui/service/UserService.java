package com.ikang.ui.service;

import com.github.pagehelper.PageInfo;
import com.ikang.ui.entity.User;

/**
 * @author xuyang
 */
public interface UserService {

    /**
     * 分页查询所用用户
     * @param pageNum 开始页
     * @param pageSize 页容量
     * @return {@link PageInfo}
     */
    PageInfo<User> findAllByPage(int pageNum, int pageSize);

    /**
     * 通过uid查询用户信息
     * @param uid 用户id
     * @return {@link User}
     */
    User findById(Integer uid);
}
