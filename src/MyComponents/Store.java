package MyComponents;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // Attributes
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

    // Getter and Setter methods
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

    // Add a product to the store
    public boolean addProduct(Product product) {
        if (products.size() >= capacity) {
            System.out.println("MyComponents.Store capacity reached! Cannot add more products.");
            return false;
        }
        if (product.getPrice() < 0) {
            System.out.println("Cannot add product with a negative price.");
            return false;
        }
        products.add(product);
        return true;
    }

    // Display store details
    public void displayStoreDetails() {
        System.out.println("MyComponents.Store Details:");
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

    // Calculate the total number of products in the store
    public int getTotalProducts() {
        return products.size();
    }
}
