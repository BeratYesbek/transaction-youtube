package com.beratyesbek.transactionyoutube.controller;

import com.beratyesbek.transactionyoutube.entity.Image;
import com.beratyesbek.transactionyoutube.entity.Product;
import com.beratyesbek.transactionyoutube.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<Product> create( ){
        Product product = Product.builder().categoryId(1).price(1000).stock(100).name("Iphone 15").build();
        Image image1 = Image.builder().name("image 1").url("www.berat.com/image1.jpg").build();
        Image image2 = Image.builder().name("image 2").url("www.berat.com/image2.jpg").build();
        Image image3 = Image.builder().name("image 3").url("www.berat.com/image3.jpg").build();
        Image image4 = Image.builder().name("image 4").url("www.berat.com/image4.jpg").build();
        List<Image> images = List.of(image1, image2, image3, image4);
        productService.create(product,images);
        return ResponseEntity.ok(product);
    }

}
