package com.beratyesbek.transactionyoutube.proxy;

import org.springframework.transaction.annotation.Transactional;

public class CategoryServiceImpl implements CategoryService {

    public CategoryServiceImpl(){

    }

    @Override
    @Transactional
    public void create() {
        // CREATE CATEGORY
        System.out.println("Category Service");
    }
}