import MyComponents.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create stores
        Store store1 = new Store(1, "Carrefour", "City Center", 10);
        Store store2 = new Store(2, "Monoprix", "Menzah 6", 10);

        // Add employees to stores
        store1.addEmployee(new Cashier(1, "Mohamed", "Centreville", 190, 101));
        store1.addEmployee(new Cashier(2, "Abdou", "Sahloul", 160, 102));
        store1.addEmployee(new Salesperson(3, "Khadija", "Sahloul2", 0, 15));
        store1.addEmployee(new Manager(4, "Leo", "Sahloul3", 170, 200));


        store2.addEmployee(new Cashier(5, "Eve", "Sahloul 4", 185, 201));
        store2.addEmployee(new Salesperson(6, "Rayan", "Menzah City", 0, 20));
        store2.addEmployee(new Salesperson(7, "Maryam", "New Menzah", 0, 25));
        store2.addEmployee(new Manager(8, "Ibra", "New Sahloul", 180, 300));


        store1.displayStoreDetails();
        store2.displayStoreDetails();

        // Calculate and display salaries
        System.out.println("Salaries of store1 employees:");
        for (Employee employee : store1.getEmployees()) {
            System.out.println(employee.getName() + ": " + employee.calculateSalary() + " DT");
        }

        System.out.println("Salaries of store2 employees:");
        for (Employee employee : store2.getEmployees()) {
            System.out.println(employee.getName() + ": " + employee.calculateSalary() + " DT");
        }
    }
}
