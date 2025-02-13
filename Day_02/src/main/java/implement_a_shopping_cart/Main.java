package implement_a_shopping_cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.99);
        cart.addProduct("Banana", 0.99);
        cart.addProduct("Milk", 3.49);
        cart.addProduct("Bread", 2.49);

        cart.displayItemsInOrder();

        System.out.println();

        cart.displayItemsSortedByPrice();
    }
}