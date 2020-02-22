package com.hex.store.product.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PRODUCT_CATEGORIES")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class Category {
    @Id
    @Column(nullable = false, unique = true)
    private String name;
}
