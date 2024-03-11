public class Salesperson implements Worker {
    private final String name;
    private final int salary;

    public Salesperson(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
    }
}
