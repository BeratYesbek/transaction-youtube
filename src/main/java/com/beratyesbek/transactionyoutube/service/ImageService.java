package com.beratyesbek.transactionyoutube.service;

import com.beratyesbek.transactionyoutube.entity.Image;
import com.beratyesbek.transactionyoutube.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void create(List<Image> imageList) {
        imageRepository.saveAll(imageList);
    }

}
