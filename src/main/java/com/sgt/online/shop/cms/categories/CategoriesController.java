package com.sgt.online.shop.cms.categories;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriesController {

    @GetMapping("/admin/categories")
    public String categories() {
        return "cms/categories/categories";
    }
}
