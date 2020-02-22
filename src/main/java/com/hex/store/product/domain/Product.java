package com.hex.store.product.domain;

import lombok.*;

import javax.persistence.*;

@Entity(name = "PRODUCTS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(
            name = "category_name",
            foreignKey = @ForeignKey(name = "CATEGORY_NAME_FK"))
    private Category category;

    @Transient
    ProductDto getDto() {
        return ProductDto.builder().name(name).price(price).categoryName(category.getName()).build();
    }
}
