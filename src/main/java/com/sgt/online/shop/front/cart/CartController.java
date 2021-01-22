package com.sgt.online.shop.front.cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import static com.sgt.online.shop.cookies.Cookies.USER_ID_COOKIE_NAME;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String cart(@CookieValue(name = USER_ID_COOKIE_NAME, required = false) String userId,
                       Model model) {
        //TODO search products which are associated to order (with status which
        //indicates that order is not completed yet)  made by user with "userId"
        //Then update this order to status which would indicate that user has completed his order
        //and it can't be modified.
        return "shop/cart";
    }
}
