package com.beratyesbek.transactionyoutube.service;

import com.beratyesbek.transactionyoutube.entity.SubCategory;
import com.beratyesbek.transactionyoutube.repository.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubCategoryService {

    private final SubCategoryRepository subCategoryRepository;

    @Transactional(propagation = Propagation.MANDATORY)
    public List<SubCategory> create(List<SubCategory> subCategories) {
         subCategoryRepository.saveAll(subCategories);
        throw new RuntimeException("");

    }

    @Transactional
    public SubCategory update(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);

    }


}
