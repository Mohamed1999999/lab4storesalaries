package MyComponents;

import java.util.Date;

public class Product {
    private int id;
    private String label;
    private String brand;
    private double price;
    private Date expirationDate;

    // Constructor for full initialization
    public Product(int id, String label, String brand, double price, Date expirationDate) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // Default constructor
    public Product() {
        this(0, "", "", 0.0, null);
    }

    // Getters and setters
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
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Compare methods
    public boolean compare(Product otherProduct) {
        return this.id == otherProduct.id &&
                this.label.equals(otherProduct.label) &&
                this.price == otherProduct.price;
    }

    public static boolean compare(Product product1, Product product2) {
        return product1.id == product2.id &&
                product1.label.equals(product2.label) &&
                product1.price == product2.price;
    }

    @Override
    public String toString() {
        String expirationInfo = (expirationDate != null) ? "Expiration Date: " + expirationDate : "Expiration Date: Not Set";
        return String.format("Product ID: %d\nLabel: %s\nBrand: %s\nPrice: %.2f\n%s\n------------------------", id, label, brand, price, expirationInfo);
    }
}
