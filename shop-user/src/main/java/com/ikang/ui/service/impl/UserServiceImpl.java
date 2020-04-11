package com.ikang.ui.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ikang.ui.entity.User;
import com.ikang.ui.dao.UserRepository;
import com.ikang.ui.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuyang
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public PageInfo<User> findAllByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userRepository.findAll();
        return new PageInfo<>(users);
    }

    @Override
    public User findById(Integer uid) {
        return userRepository.findById(uid).orElseGet(User::new);
    }
}
