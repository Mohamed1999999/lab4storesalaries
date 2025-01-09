package MyComponents;

import java.util.Date;

public class Product {
    // Attributes
    private int id;
    private String label;
    private String brand;
    private double price;
    private Date expirationDate;

    // Constructor for creating a product with all details
    public Product(int id, String label, String brand, double price, Date expirationDate) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // Default constructor (for empty product)
    public Product() {
        this(0, "", "", 0.0, null);
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Method to format the display of product information
    @Override
    public String toString() {
        String expirationInfo = (expirationDate != null) ? "Expiration Date: " + expirationDate : "Expiration Date: Not Set";
        return String.format("MyComponents.Product ID: %d\nLabel: %s\nBrand: %s\nPrice: %.2f\n%s\n------------------------", id, label, brand, price, expirationInfo);
    }
}
