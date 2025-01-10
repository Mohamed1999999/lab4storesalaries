package MyComponents;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private String address;
    private int capacity;
    private List<Product> products;

    // Constructor
    public Store(int id, String address, int capacity) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Add product to store
    public boolean addProduct(Product product) {
        if (products.size() >= capacity) {
            System.out.println("Store capacity reached! Cannot add more products.");
            return false;
        }
        if (products.stream().anyMatch(existingProduct -> existingProduct.compare(product))) {
            System.out.println("Product already exists in the store.");
            return false;
        }
        products.add(product);
        return true;
    }

    // Search for a product in the store
    public boolean searchProduct(Product product) {
        return products.stream().anyMatch(existingProduct -> existingProduct.compare(product));
    }

    // Remove a product from the store
    public boolean removeProduct(Product product) {
        return products.removeIf(existingProduct -> existingProduct.compare(product));
    }

    // Get the store with more products
    public static Store getStoreWithMoreProducts(Store store1, Store store2) {
        return store1.products.size() >= store2.products.size() ? store1 : store2;
    }

    // Display store details
    public void displayStoreDetails() {
        System.out.println("Store Details:");
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Number of Products: " + products.size());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getLabel() + " ($" + product.getPrice() + ")");
        }
        System.out.println("------------------------");
    }
}
