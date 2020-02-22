package com.hex.store.product.domain.trait

import com.hex.store.product.domain.ProductDto

class SampleProducts {
    ProductDto gunToy = ProductDto.builder().name("Gun toy").price(20.99).categoryName("toy").build()
    ProductDto gunReal = ProductDto.builder().name("Gun gun").price(220.99).categoryName("gun").build()
    ProductDto harryPot = ProductDto.builder().name("Harry the pot").price(30.99).categoryName("book").build()
}
