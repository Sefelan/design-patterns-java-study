import java.util.ArrayList;

public class StaffList implements Employee {

    private final ArrayList<Employee> employees = new ArrayList<Employee>();

    public StaffList() {
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public double getSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    @Override
    public void accept(SalaryVisitor salaryVisitor) {
        for (Employee employee : employees) {
            employee.accept(salaryVisitor);
        }
    }


}
