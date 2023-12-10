package com.beratyesbek.transactionyoutube.controller;

import com.beratyesbek.transactionyoutube.entity.Category;
import com.beratyesbek.transactionyoutube.entity.SubCategory;
import com.beratyesbek.transactionyoutube.service.CategoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Category> create() {
        Category category = new Category();
        category.setName("Phone");
        SubCategory subCategory1 = SubCategory.builder().name("Smart Phone").build();
        SubCategory subCategory2 = SubCategory.builder().name("Old Phone").build();
        List<SubCategory> subCategories = List.of(
            subCategory1,
            subCategory2
        );
        return ResponseEntity.ok(categoryService.create(category,subCategories));
    }

}
