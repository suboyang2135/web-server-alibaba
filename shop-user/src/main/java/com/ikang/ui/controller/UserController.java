package com.ikang.ui.controller;

import com.ikang.ui.entity.User;
import com.ikang.ui.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuyang
 */
@Slf4j
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{uid}")
    public User findUserById(@PathVariable Integer uid) {
        return userService.findById(uid);
    }

}
