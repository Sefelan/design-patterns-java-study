public class SalesPerson implements Employee {

    private double salary;

    public SalesPerson(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(SalaryVisitor salaryVisitor) {
        salaryVisitor.visit(this);
    }
}
