package com.ikang.ui.integration;

import com.ikang.ui.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuyang
 */
@FeignClient(name = "service-user")
public interface UserService {

    @GetMapping("/v1/user/{uid}")
    User findUserById(@PathVariable Integer uid);
}
