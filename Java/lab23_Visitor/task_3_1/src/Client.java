public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60_000));
        staffList.addEmployee(new SalesPerson(50_000));
        staffList.addEmployee(new SalesPerson(35_000));

        System.out.println("Total amount paid to staff:\n" + staffList.getSalary());

        SalaryVisitor payCut = new PayCut();
        staffList.accept(payCut);
        staffList.accept(payCut);
        staffList.accept(payCut);
        staffList.accept(payCut);
        System.out.println("Total amount paid to staff after pay cuts:\n" + staffList.getSalary());

        SalaryVisitor payRise = new PayRise();
        staffList.accept(payRise);
        System.out.println("Total amount paid to staff after pay rise:\n" + staffList.getSalary());

        Employee itWorker = new ItWorker(45_000);
        System.out.println("\nNew IT Guy salary: " + itWorker.getSalary());

        itWorker.accept(payCut);
        System.out.println("No pay cuts to IT! Salary: " + itWorker.getSalary());

        itWorker.accept(payRise);
        System.out.println("Small pay rise, new salary: " + itWorker.getSalary());
    }

}
