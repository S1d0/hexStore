package com.hex.store.product.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductFacade {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ProductCreator creator = new ProductCreator();

    public void createProduct(ProductDto productDto) {
        categoryRepository.findById(productDto.getCategoryName()).ifPresent(category -> {
            Product product = creator.createProduct(productDto);
            creator.supplyCategory(product, category);
            productRepository.save(product);
        });
    }
}
