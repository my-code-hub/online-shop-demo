package com.sgt.online.shop.cms.products;

import java.util.Set;

public class ProductForm {
    private Long id;
    private String name;
    private Set<Long> categoryIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Set<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public boolean isNew() {
        return this.id == null;
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryIds=" + categoryIds +
                '}';
    }
}
