package com.sgt.online.shop.front.cart.validation;

import com.sgt.online.shop.front.cart.AddProductToCartForm;
import com.sgt.online.shop.front.cart.ProductsService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//This is example of JSR-303 validation.
//Google "jsr 303 spring validation" to read and see more examples
public class AddProductToCartFormValidator implements
        ConstraintValidator<ValidAddProductToCartForm, AddProductToCartForm> {

    private final ProductsService productsService;

    public AddProductToCartFormValidator(ProductsService productsService) {
        this.productsService = productsService;
    }

    @Override
    public void initialize(ValidAddProductToCartForm constraintAnnotation) {
    }

    //This method will run before spring controller method runs. Here we can run our logic and
    //validate the request based on multiple fields (or just a single field)
    //If we return false and set error, that means there will be error. If this method returns
    //true then it means object is valid.
    @Override
    public boolean isValid(AddProductToCartForm form,
                           ConstraintValidatorContext context) {
        if (!productsService.isProductAvailableInStock(form.getProductId(), form.getQuantity())) {
            addError("quantity", "Not enough product in stock", context);
            return false;
        }
        return true;
    }

    private void addError(String field, String errorMessage, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(errorMessage)
                .addPropertyNode(field)
                .addConstraintViolation();
    }
}
