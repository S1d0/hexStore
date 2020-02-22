package com.hex.store.product.domain

import spock.lang.Shared
import spock.lang.Specification

class ProductSpec extends Specification {
    @Shared
    ProductFacade facade

    def setupSpec() {
        facade = new ProductConfiguration().facade(
                new InMemoProductRepo(),
                new InMemoryCategoryRepository()
        )
    }
}
