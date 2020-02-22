package com.hex.store.product.domain.trait

import com.hex.store.product.domain.CategoryDto

trait SampleCategories {
    CategoryDto gunCategory = new CategoryDto("gun")
    CategoryDto bookCategory = new CategoryDto("book")
    CategoryDto toyCategory = new CategoryDto("toy")
}
