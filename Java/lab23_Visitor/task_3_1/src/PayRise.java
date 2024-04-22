public class PayRise implements SalaryVisitor {
    @Override
    public void visit(Manager manager) {
        double salary = manager.getSalary();
        salary = salary * 1.35;
        manager.setSalary(salary);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        double salary = salesPerson.getSalary();
        salary = salary * 1.25;
        salesPerson.setSalary(salary);
    }

    @Override
    public void visit(ItWorker itWorker) {
        double salary = itWorker.getSalary();
        salary = salary * 1.15;
        itWorker.setSalary(salary);
    }
}
