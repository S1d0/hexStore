package com.hex.store.product.domain

import com.hex.store.product.domain.trait.SampleCategories
import com.hex.store.product.domain.trait.SampleProducts
import spock.lang.Shared
import spock.lang.Specification

class ProductSpecification extends Specification implements SampleProducts, SampleCategories{
    private final static ProductCreator creator = new ProductCreator();
    @Shared
    ProductFacade facade;
    @Shared
    ProductRepository productRepository
    @Shared
    CategoryRepository categoryRepository


    def setupSpec() {
        Category categoryToy = new Category("toy")
        Category categoryBook = new Category("book")
        Category categoryGun = new Category("gun")
        categoryRepository = new InMemoryCategoryRepository();
        categoryRepository.save(categoryToy)
        categoryRepository.save(categoryBook)
        categoryRepository.save(categoryGun)

        productRepository = new InMemoProductRepo();
        Product productGunToy = creator.createProduct(gunToy)
        Product productGun = creator.createProduct(gunReal)
        Product productBook = creator.createProduct(harryPot)
        productGunToy.setCategory(categoryToy)
        productGun.setCategory(categoryGun)
        productBook.setCategory(categoryBook)

        productRepository.save(productGunToy)
        productRepository.save(productGun)
        productRepository.save(productBook)

        facade = new ProductConfiguration().facade(productRepository, categoryRepository)
    }

}
