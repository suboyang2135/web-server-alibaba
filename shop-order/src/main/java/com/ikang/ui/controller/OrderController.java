package com.ikang.ui.controller;

import com.ikang.ui.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuyang
 */
@Slf4j
@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @Resource
    private OrderService orderService;
}
