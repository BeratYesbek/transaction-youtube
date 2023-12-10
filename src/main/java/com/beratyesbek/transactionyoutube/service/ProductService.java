package com.beratyesbek.transactionyoutube.service;

import com.beratyesbek.transactionyoutube.entity.Image;
import com.beratyesbek.transactionyoutube.entity.Product;
import com.beratyesbek.transactionyoutube.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ImageService imageService;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    public void create(Product product, List<Image> images) {
        productRepository.save(product);
        images.forEach(image -> image.setProductId(product.getId()));
        createImages(images);
        throw new RuntimeException("Exception Occurred");
    }

    private void createImages(List<Image> images) {
        imageService.create(images);
    }


}
