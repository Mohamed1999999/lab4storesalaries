package MyComponents;

public class Salesperson extends Employee {
    private double salesRate;

    public Salesperson(int id, String name, String address, int hoursPerMonth, double salesRate) {
        super(id, name, address, hoursPerMonth);
        this.salesRate = salesRate;
    }

    @Override
    public double calculateSalary() {
        return 450 * (salesRate / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Sales Rate: %.2f%%", salesRate);
    }
}
