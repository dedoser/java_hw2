package org.vmk.dep508.collections.basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

    private final Map<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (basket.containsKey(product)) {
            basket.computeIfPresent(product, (k, v) -> v += quantity);
        }
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        if (basket.containsKey(product)) {
            basket.remove(product);
        } else {
            throw new BasketErrorException();
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
        } else {
            throw new BasketErrorException();
        }
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basket.keySet());
    }
}
