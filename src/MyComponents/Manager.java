package MyComponents;

public class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, String address, int hoursPerMonth, double bonus) {
        super(id, name, address, hoursPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = hoursPerMonth * 10;
        if (hoursPerMonth > 160) {
            salary += (hoursPerMonth - 160) * 10 * 0.20;
        }
        return salary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Bonus: %.2f", bonus);
    }
}
