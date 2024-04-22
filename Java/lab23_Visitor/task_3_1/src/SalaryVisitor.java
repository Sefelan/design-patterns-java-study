public interface SalaryVisitor {
    void visit(Manager manager);
    void visit(SalesPerson salesPerson);

    void visit(ItWorker itWorker);
}
