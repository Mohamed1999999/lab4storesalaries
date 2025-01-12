package MyComponents;

public abstract class Employee {
    protected int id;
    protected String name;
    protected String address;
    protected int hoursPerMonth;

    // Constructor
    public Employee(int id, String name, String address, int hoursPerMonth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hoursPerMonth = hoursPerMonth;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    // toString method
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Address: %s, Hours: %d", id, name, address, hoursPerMonth);
    }
}
