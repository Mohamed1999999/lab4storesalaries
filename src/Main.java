import java.util.Date;
import MyComponents.Product;
import MyComponents.Store;

public class Main {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store(1, "123 Main St", 5);

        // Create products
        Product milk = new Product(1021, "Milk", "Delight", 0.700, new Date(2025, 2, 15));
        Product yogurt = new Product(2510, "Yogurt", "Vitalait", 0.500, new Date(2025, 3, 10));
        Product tomato = new Product(3250, "Tomato", "Sicam", 1.200, new Date(2025, 4, 30));

        // Add products to the store
        store.addProduct(milk);
        store.addProduct(yogurt);
        store.addProduct(tomato);

        // Display store details
        store.displayStoreDetails();

        // Calculate and display the total number of products
        System.out.println("Total products in the store: " + store.getTotalProducts());
    }
}
