package com.beratyesbek.transactionyoutube.repository;

import com.beratyesbek.transactionyoutube.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
