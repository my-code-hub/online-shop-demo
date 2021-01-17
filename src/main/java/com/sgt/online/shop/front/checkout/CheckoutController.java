package com.sgt.online.shop.front.checkout;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static com.sgt.online.shop.cookies.Cookies.USER_ID_COOKIE_NAME;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String checkout(Model model,
                           @CookieValue(name = USER_ID_COOKIE_NAME, required = false) String userId) {
        model.addAttribute("checkoutForm", new CheckoutForm());
        return "shop/checkout/checkout";
    }

    @PostMapping("/checkout")
    public String submitCheckoutForm(@CookieValue(name = USER_ID_COOKIE_NAME, required = false) String userId,
                                     Model model,
                                     CheckoutForm form) {
        System.out.println("received data from browser: " + form);
        return "shop/checkout/checkout-success";
    }
}
