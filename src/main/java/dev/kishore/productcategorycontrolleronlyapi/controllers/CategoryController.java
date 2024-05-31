package dev.kishore.productcategorycontrolleronlyapi.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")// static endpoint for all methods "/products/categories"
public class CategoryController {

    @GetMapping()
    public String getAllCategories() {

        return "Getting all categories";
    }

    @GetMapping("/{categoryId}") // unique endpoint "/{categoryId}"
    public String getProductsInCategory(@PathVariable("categoryId") Long categoryId) {
        return "Get products in category :" + categoryId;
    }
}
