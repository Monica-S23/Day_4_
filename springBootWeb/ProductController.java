package com.telusko.springBootWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product/name/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProductByName(name);
    }

    @GetMapping("/product/type/{type}")
    public List<Product> getProductByType(@PathVariable String type){
        return service.getProductByType(type);
    }

   @GetMapping("/product/place/{place}")
    public List<Product> getProductByPlace(@PathVariable String place){
        return service.getProductByPlace(place);
    }

    @GetMapping("/product/text/{text}")
    public List<Product> getProductByText(@PathVariable String text){
        return service.getProductByText(text);
    }

    @PostMapping ("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
