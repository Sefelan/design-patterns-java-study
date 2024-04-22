public class PayCut implements SalaryVisitor {
    @Override
    public void visit(Manager manager) {
        double salary = manager.getSalary();
        salary = Math.max(2500, salary - 1000);
        manager.setSalary(salary);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        double salary = salesPerson.getSalary();
        salary = Math.max(1500, salary - 3000);
        salesPerson.setSalary(salary);

    }

    @Override
    public void visit(ItWorker itWorker) {
    }
}
