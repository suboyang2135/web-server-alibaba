package com.ikang.ui.integration;

import com.ikang.ui.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuyang
 */
@FeignClient(name = "service-product")
public interface ProductService {

    @GetMapping("/v1/product/{pid}")
    Product findProductById(@PathVariable Integer pid);
}
