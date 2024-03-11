import java.util.ArrayList;
import java.util.List;

public class Manager extends Salesperson {
    private final List<Worker> subordinates = new ArrayList<>();

    public Manager(String name, int salary) {
        super(name, salary);
    }

    void add(Worker worker) {
        subordinates.add(worker);
    }

    void remove(Worker worker) {
        subordinates.remove(worker);
    }

    public List<Worker> getSubordinates() {
        return new ArrayList<>(subordinates);
    }

    @Override
    public void payExpenses() {
        super.payExpenses();
        System.out.println("Manager " + getName() + " has " + subordinates.size() + " subordinates:\n");
        for (Worker subordinate : subordinates) {
            subordinate.payExpenses();
        }
        System.out.println("\n");
    }
}