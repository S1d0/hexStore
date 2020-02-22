package com.hex.store.product.domain

class ProductFacadeTest extends ProductSpecification {
    def "should create new product"() {
        given:
        ProductDto dto = ProductDto.builder()
                .name("Rubber duck")
                .price(20.99)
                .categoryName(toyCategory.getName())
                .build()

        when:
        facade.createProduct(dto)

        then:
        productRepository.findAll().stream()
                .filter({ p -> p.name == "Rubber duck" })
                .findAny()
                .isPresent()
    }

    def "should remove product from repo"() {
        when:
        facade.removeProduct(1L)

        then:
        productRepository.findAll().size() == 2
    }

}
