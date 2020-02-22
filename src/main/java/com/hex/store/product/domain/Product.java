package com.hex.store.product.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name = "PRODUCTS")
@Data
@Builder
@EqualsAndHashCode(exclude = "id")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double price;

    @ManyToOne()
    @JoinColumn(
            name = "category_name",
            foreignKey = @ForeignKey(name = "CATEGORY_NAME_FK"))
    private Category category;
}
