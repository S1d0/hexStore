package com.hex.store.product.domain;

class ProductCreator {
    Product createProduct(ProductDto dto) {
        return Product.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .build();
    }

    void supplyCategory(Product product, Category category) {
        product.setCategory(category);
    }
}
