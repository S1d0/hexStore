package com.hex.store.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ProductDto {
    @JsonProperty
    private String name;
    @JsonProperty
    private Double price;
    @JsonProperty
    private String categoryName;
}
