package controller;

import model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired //baska service'e depend olacagim -- ioc de olan ilgili service'i buraya inject eder.
    ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity product){
        System.out.println(product.getTitle());
        ProductEntity product1 = productService.updateProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> getProducts(){
        ProductEntity p1 = new ProductEntity();
        ProductEntity p2 = new ProductEntity();
        p1.setTitle("pr1-çisel");
        p1.setDescription("çisel");
        p2.setTitle("pr1-sinan");
        p2.setDescription("sinan");

        return new ResponseEntity<>(List.of(p1,p2), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts(){
        return new ResponseEntity<>(productService.returnAllTheProducts(), HttpStatus.OK);
    }

}
