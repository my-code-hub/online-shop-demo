package com.sgt.online.shop.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping
    public String home(@PathVariable(required = false) String categoryName) {
        System.out.println(categoryName);
        return "shop/index";
    }
}
