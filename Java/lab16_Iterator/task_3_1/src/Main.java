public class Main {
    public static void main(String[] args) {

        Employee zak = new Employee("Zak");
        Employee sarah = new Employee("Sarah");
        Employee anna = new Employee("Anna");

        StaffList staffList = new StaffList();
        staffList.addEmployee(zak);
        staffList.addEmployee(sarah);
        staffList.addEmployee(anna);

        Iterator iterator = staffList.createIterator();
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}
