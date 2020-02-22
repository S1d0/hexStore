package com.hex.store.product.domain

import spock.lang.Specification
import spock.lang.Subject

class ProductFacadeTest extends Specification {
    @Subject
    ProductFacade facade = new ProductConfiguration().getFacade()

    def "should create new product"() {
        given:
        ProductDto dto = ProductDto.builder()
                .name("Rubber duck")
                .price(20.99)
                .category(getCategory("toy"))
                .build()

        expect:
        facade.createProduct(dto)
    }

}
