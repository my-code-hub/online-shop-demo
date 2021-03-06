package com.sgt.online.shop.cms.categories;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriesController {

    @GetMapping(path = {"/admin/categories", "/admin"})
    public String categories() {
        return "cms/categories/categories";
    }

    @GetMapping("/admin/categories/create")
    public String create() {
        return "cms/categories/";
    }
}
