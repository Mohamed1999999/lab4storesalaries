package MyComponents;

public class Cashier extends Employee {
    private int cashRegisterNumber;

    public Cashier(int id, String name, String address, int hoursPerMonth, int cashRegisterNumber) {
        super(id, name, address, hoursPerMonth);
        this.cashRegisterNumber = cashRegisterNumber;
    }

    @Override
    public double calculateSalary() {
        double salary = hoursPerMonth * 5;
        if (hoursPerMonth > 180) {
            salary += (hoursPerMonth - 180) * 5 * 0.15;
        }
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Cash Register: %d", cashRegisterNumber);
    }
}