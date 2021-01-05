package com.sgt.online.shop.cms.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class ProductsController {

    @GetMapping("/admin/products")
    public String categories() {
        return "cms/products/products";
    }

    //Here we will display the form for creating product
    @GetMapping("/admin/products/create")
    public String showCreateForm(Model model) {
        model.addAttribute("productForm", new ProductForm());
        model.addAttribute("categories", getCategories());
        return "cms/products/create-edit-product";
    }

    //This method will be called when user fills the form and clicks the submit button
    @PostMapping("/admin/products/create")
    public String create(ProductForm form, Model model) {
        System.out.println("product create form: " + form);
        //TODO here you can save the received data about products in database
        //TODO and then you can assign this product to the categories ( form.getCategoryIds() )
        //for this product

        // By using this redirect we redirect user back to products table
        // after successful product creation
        return "redirect:/admin/products";
    }

    //Here we will display the form for creating product
    @GetMapping("/admin/products/edit/{productId}")
    public String showEditForm(@PathVariable Long productId, Model model) {
        //TODO search product and it's categories in database
        //and create ProductForm object (here you need to set all properties)
        ProductForm product = new ProductForm();
        product.setId(1L);
        product.setName("Test product");


        // add product list of categories to model
        model.addAttribute("productForm", product);
        model.addAttribute("categories", getCategories());
        return "cms/products/create-edit-product";
    }

    //This method will be called when user fills the form and clicks the submit button
    //for editing product
    @PostMapping("/admin/products/edit/{productId}")
    public String update(@PathVariable Long productId,
                         ProductForm form, Model model) {
        System.out.println("product update form: " + form);
        //TODO here you can run SQL query which will update existing
        //product in database
        //TODO you also have to update how this product is mapped to categories
        return "redirect:/admin/products";
    }

    //this is just example method, you will have to
    //use repository and get actual categories from database
    private List<Category> getCategories() {
        return asList(
            new Category(1L, "Category 1"),
            new Category(2L, "Category 2")
        );
    }
}
