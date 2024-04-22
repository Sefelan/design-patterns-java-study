public class ItWorker implements Employee {

    private double salary;

    public ItWorker(double salary) {
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
