package com.beratyesbek.transactionyoutube.service;

import com.beratyesbek.transactionyoutube.entity.Category;
import com.beratyesbek.transactionyoutube.entity.SubCategory;
import com.beratyesbek.transactionyoutube.exceptions.MyException;
import com.beratyesbek.transactionyoutube.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    private final SubCategoryService subCategoryService;

    @Transactional(propagation = Propagation.REQUIRED)
    public Category create(Category category, List<SubCategory> subCategories) {
        categoryRepository.save(category);
        subCategoryService.create(subCategories);
        return category;
    }


}
