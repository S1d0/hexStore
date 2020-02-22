package com.hex.store.product.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@EqualsAndHashCode
class Category {
    @Id
    @Column(nullable = false, unique = true)
    private String name;
}
