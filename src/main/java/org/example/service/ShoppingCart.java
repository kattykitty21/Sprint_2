package org.example.service;

import org.example.model.Food;
import org.example.model.Discountable;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : products) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : products) {
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            total += item.getTotalPrice() * (1 - discount / 100);
        }
        return total;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : products) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}
