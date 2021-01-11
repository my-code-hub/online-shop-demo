package com.sgt.online.shop.front;

public class AddProductToCartForm {
    private Integer quantity = 1;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AddProductToCartForm{" +
                "quantity=" + quantity +
                '}';
    }
}
