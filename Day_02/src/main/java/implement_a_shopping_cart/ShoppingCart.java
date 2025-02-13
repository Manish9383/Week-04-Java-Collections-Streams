package implement_a_shopping_cart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Product> orderedItems = new LinkedHashMap<>();
    private Map<Double, Product> itemsSortedByPrice = new TreeMap<>();

    public Map<String, Double> getProductPrices() {
        return productPrices;
    }

    public Map<String, Product> getOrderedItems() {
        return orderedItems;
    }

    public Map<Double, Product> getItemsSortedByPrice() {
        return itemsSortedByPrice;
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        productPrices.put(name, price);
        orderedItems.put(name, product);
        itemsSortedByPrice.put(price, product);
    }

    public void displayItemsInOrder() {
        System.out.println("Items in Order of Addition:");
        orderedItems.forEach((name, product) ->
                System.out.println(product)
        );
    }

    public void displayItemsSortedByPrice() {
        System.out.println("Items Sorted by Price:");
        itemsSortedByPrice.forEach((price, product) ->
                System.out.println(product)
        );
    }
}
