package com.hex.store.product.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProductConfiguration {
    @Bean
    ProductFacade facade(ProductRepository productRepository, CategoryRepository categoryRepository) {
        return new ProductFacade(productRepository, categoryRepository);
    }
}
