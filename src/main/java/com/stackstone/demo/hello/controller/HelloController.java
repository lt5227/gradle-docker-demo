package com.stackstone.demo.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>Copyright (c) 2021 StackStone All rights reserved.</p>
 *
 * @author lee
 * @version 1.0.0
 * @date 2021/4/9 10:30
 * @since 1.0.0
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("hi", "Hello World");
        return "hello";
    }
}
