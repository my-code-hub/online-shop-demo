package com.sgt.online.shop.front.cart;

import org.springframework.stereotype.Component;

@Component
public class ProductsService {

    //TODO just example method. You can change the value between true / false
    //and this will change the result of your product being added to cart.
    public boolean isProductAvailableInStock(Long productId, Integer requiredAmount) {

        return false;
    }
}
