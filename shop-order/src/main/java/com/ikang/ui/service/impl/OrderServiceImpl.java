package com.ikang.ui.service.impl;

import com.ikang.ui.dao.OrderRepository;
import com.ikang.ui.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuyang
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository orderRepository;

}
