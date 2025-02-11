package dynamic_online_marketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
         Product<Category> products=new Product<>();
         products.addProduct(new Books("Ignite Minds", 300));
         products.addProduct(new Gadgets("Google Smart Homes ",3500));
         products.addProduct(new Clothing("Shirts",420));
         products.displayProducts();
        System.out.println("+++++++++++++++++++++++++++++");
         products.applyDiscount(10);
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
