package MyComponents;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private String name; // Ajout du nom du magasin
    private String address;
    private int capacity;
    private List<Product> products = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    // Constructor
    public Store(int id, String name, String address, int capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // Add employee to store
    public boolean addEmployee(Employee employee) {
        if (employees.size() >= 20) {
            System.out.println("Cannot add more employees. Maximum capacity reached.");
            return false;
        }
        employees.add(employee);
        return true;
    }

    // Get employees
    public List<Employee> getEmployees() {
        return employees;
    }

    // Display store details
    public void displayStoreDetails() {
        System.out.println("Store Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Number of Products: " + products.size());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getLabel() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------------");
    }
}
