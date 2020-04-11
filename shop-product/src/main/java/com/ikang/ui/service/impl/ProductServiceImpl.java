package com.ikang.ui.service.impl;

import com.ikang.ui.entity.Product;
import com.ikang.ui.dao.ProductRepository;
import com.ikang.ui.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author xuyang
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepository productRepository;

    @Override
    public Product findById(Integer pid) {
        Optional<Product> productOptional = productRepository.findById(pid);
        return productOptional.orElseGet(Product::new);
    }
}
