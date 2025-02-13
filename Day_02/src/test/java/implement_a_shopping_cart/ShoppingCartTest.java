package implement_a_shopping_cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testAddProduct() {
        cart.addProduct("Apple", 1.99);
        cart.addProduct("Banana", 0.99);

        Map<String, Double> productPrices = cart.getProductPrices();
        assertEquals(2, productPrices.size(), "There should be 2 products in the cart.");
        assertTrue(productPrices.containsKey("Apple"), "Apple should be in the cart.");
        assertTrue(productPrices.containsKey("Banana"), "Banana should be in the cart.");
        assertEquals(1.99, productPrices.get("Apple"), "The price of Apple should be $1.99.");
        assertEquals(0.99, productPrices.get("Banana"), "The price of Banana should be $0.99.");
    }

    @Test
    void testDisplayItemsInOrder() {
        cart.addProduct("Apple", 1.99);
        cart.addProduct("Banana", 0.99);
        cart.addProduct("Milk", 3.49);
        cart.addProduct("Bread", 2.49);


        cart.displayItemsInOrder();


        Map<String, Product> orderedItems = cart.getOrderedItems();
        assertEquals(4, orderedItems.size(), "There should be 4 products in order.");
        assertTrue(orderedItems.containsKey("Apple"));
        assertTrue(orderedItems.containsKey("Banana"));
        assertTrue(orderedItems.containsKey("Milk"));
        assertTrue(orderedItems.containsKey("Bread"));
    }

    @Test
    void testDisplayItemsSortedByPrice() {
        cart.addProduct("Apple", 1.99);
        cart.addProduct("Banana", 0.99);
        cart.addProduct("Milk", 3.49);
        cart.addProduct("Bread", 2.49);


        cart.displayItemsSortedByPrice();


        Map<Double, Product> sortedItems = cart.getItemsSortedByPrice();
        assertEquals(4, sortedItems.size(), "There should be 4 products in sorted order.");
        assertTrue(sortedItems.containsKey(0.99));
        assertTrue(sortedItems.containsKey(1.99));
        assertTrue(sortedItems.containsKey(2.49));
        assertTrue(sortedItems.containsKey(3.49));
    }

    @Test
    void testDisplayItemsSortedByPriceOrder() {
        cart.addProduct("Apple", 1.99);
        cart.addProduct("Banana", 0.99);
        cart.addProduct("Milk", 3.49);
        cart.addProduct("Bread", 2.49);

        Map<Double, Product> sortedItems = cart.getItemsSortedByPrice();
        assertEquals(0.99, sortedItems.keySet().toArray()[0], "The first item in sorted order should have the lowest price.");
        assertEquals(3.49, sortedItems.keySet().toArray()[3], "The last item in sorted order should have the highest price.");
    }
}
