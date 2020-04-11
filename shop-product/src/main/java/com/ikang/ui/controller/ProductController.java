package com.ikang.ui.controller;

import com.ikang.ui.entity.Product;
import com.ikang.ui.service.ProductService;
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
@RequestMapping("/v1/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping("/{pid}")
    public Product findProductById(@PathVariable Integer pid) {
        log.info("select product by pid = {}", pid);
        return productService.findById(pid);
    }
}
