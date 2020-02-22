package com.hex.store.product;

import com.hex.store.product.domain.ProductDto;
import com.hex.store.product.domain.ProductFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
class ProductController {
    private final ProductFacade facade;

    @GetMapping
    List<ProductDto> getProducts() {
        return facade.getProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createProduct(@RequestBody ProductDto dto) {
        facade.createProduct(dto);
    }
}
