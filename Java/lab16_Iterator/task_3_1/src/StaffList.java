import java.util.ArrayList;
import java.util.List;

public class StaffList implements IterableCollection {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator createIterator() {
        return new StaffListIterator(this);
    }

    private static class StaffListIterator implements Iterator {

        private final List<Employee> employees;
        private int iterationState;

        public StaffListIterator(StaffList staffList) {
            this.employees = staffList.employees;
            this.iterationState = 0;
        }

        @Override
        public Employee getNext() {
            return employees.get(iterationState++);
        }

        @Override
        public boolean hasMore() {
            return iterationState < employees.size();
        }
    }
}
