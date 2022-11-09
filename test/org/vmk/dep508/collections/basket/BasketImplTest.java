package org.vmk.dep508.collections.basket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketImplTest {

    private Basket basket;

    @BeforeEach
    void setUp() {
        basket = new BasketImpl();
    }

    @Test
    void addProduct() {
        basket.addProduct("product", 1);
        basket.addProduct("anotherProduct", 1);
        List<String> products = basket.getProducts();
        assertEquals(2, products.size());
        assertTrue(products.contains("product"));
        assertTrue(products.contains("anotherProduct"));
    }

    @Test
    void removeProduct() {
        basket.addProduct("product", 2);
        basket.removeProduct("product");
        List<String> products = basket.getProducts();
        assertTrue(products.isEmpty());
    }

    @Test
    void removeUnknownProduct() {
        basket.addProduct("product", 2);
        assertThrows(BasketErrorException.class, () -> basket.removeProduct("ololo"));
    }

    @Test
    void updateProductQuantity() {
        basket.addProduct("product", 2);
        assertDoesNotThrow(() -> basket.updateProductQuantity("product", 5));
    }

    @Test
    void updateUnknownProductQuantity() {
        basket.addProduct("product", 2);
        assertThrows(BasketErrorException.class, () -> basket.updateProductQuantity("ololo", 100111));
    }
}