package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] products = { meat, redApple, greenApple };
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Total without discount: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Total with discount: " + cart.getTotalPriceWithDiscount());
        System.out.println("Total vegetarian products without discount: " + cart.getVegetarianTotalPriceWithoutDiscount());
    }
}
