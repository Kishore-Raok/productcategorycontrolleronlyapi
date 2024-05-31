package dev.kishore.productcategorycontrolleronlyapi.controllers;


import dev.kishore.productcategorycontrolleronlyapi.dtos.productDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getAllProduct(){

        return "Returns All Products ";
    }

    @GetMapping("/products/{id}")
    public String getSingleProduct(@PathVariable("id") Long id){

        return "Returns Single Product :" + id;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody productDTO productDTO){

        return "Adding New Product:" + productDTO;
    }

    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable("id") Long id){

        return "Updating Product :" + id;
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") Long id){

        return " deleted :" + id;
    }
}
