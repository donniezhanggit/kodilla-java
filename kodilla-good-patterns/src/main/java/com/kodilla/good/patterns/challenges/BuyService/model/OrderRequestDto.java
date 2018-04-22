package com.kodilla.good.patterns.challenges.BuyService.model;

import java.util.Objects;

public class OrderRequestDto {

    private final Product product;
    private final int quantity;

    public OrderRequestDto(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequestDto that = (OrderRequestDto) o;
        return quantity == that.quantity &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {

        return Objects.hash(product, quantity);
    }
}
