public interface Employee {
    double getSalary();
    void accept(SalaryVisitor salaryVisitor);
}
