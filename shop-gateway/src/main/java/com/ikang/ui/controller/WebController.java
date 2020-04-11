package com.ikang.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyang
 */
@RestController
public class WebController {

    @GetMapping("/check")
    public String check() {
        return "Hello , i am still alive";
    }
}
