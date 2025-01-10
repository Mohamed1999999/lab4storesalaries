import java.util.Date;
import MyComponents.Product;
import MyComponents.Store;

public class Main {
    public static void main(String[] args) {
        // Create stores
        Store store1 = new Store(1, "123 Main St", 5);
        Store store2 = new Store(2, "456 Elm St", 5);

        // Create products
        Product milk = new Product(1021, "Milk", "Delight", 0.700, new Date(2025, 2, 15));
        Product yogurt = new Product(2510, "Yogurt", "Vitalait", 0.500, new Date(2025, 3, 10));
        Product tomato = new Product(3250, "Tomato", "Sicam", 1.200, new Date(2025, 4, 30));

        // Add products to stores
        store1.addProduct(milk);
        store1.addProduct(yogurt);
        store1.addProduct(tomato);

        store2.addProduct(milk);

        // Search for a product
        System.out.println("Is Milk in store1? " + store1.searchProduct(milk));

        // Remove a product
        store1.removeProduct(milk);
        System.out.println("Is Milk in store1 after removal? " + store1.searchProduct(milk));

        // Compare two stores
        Store largerStore = Store.getStoreWithMoreProducts(store1, store2);
        System.out.println("Store with more products: " + largerStore.getAddress());

        // Display store details
        store1.displayStoreDetails();
        store2.displayStoreDetails();
    }
}
