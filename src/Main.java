import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1) Initialize and create the products with new expiration dates
        Product milk = new Product(1021, "Milk", "Delight", 0.0, new Date(2025, 2, 15));
        Product yogurt = new Product(2510, "Yogurt", "Vitalait", 0.0, new Date(2025, 3, 10));
        Product tomato = new Product(3250, "Tomato", "Sicam", 1.200, new Date(2025, 4, 30));

        // 2) Display details of the products (initially with no price set)
        displayProductDetails(milk);
        displayProductDetails(yogurt);
        displayProductDetails(tomato);

        // 3) Set prices for the products and display the updated details
        milk.setPrice(0.700);
        yogurt.setPrice(0.500);
        tomato.setPrice(1.200);

        displayProductDetails(milk);
        displayProductDetails(yogurt);
        displayProductDetails(tomato);

        // 4) Print product information using the toString() method
        System.out.println(milk);
        System.out.println(yogurt);
        System.out.println(tomato);
    }

    // Helper method to display product details
    private static void displayProductDetails(Product product) {
        System.out.println(product);
    }
}
