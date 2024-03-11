public class ExpensesClient {
    public static void main(String[] args) {
        Manager director = new Manager("Jane", 50_000);

        Manager meatManager = new Manager("Bob", 30_000);
        Manager dairyManager = new Manager("Sue", 30_000);
        Manager confectioneryManager = new Manager("Mike", 30_000);
        Salesperson directorSecretary1 = new Salesperson("Emily", 25_000);
        Salesperson directorSecretary2 = new Salesperson("James", 25_000);

        director.add(meatManager);
        director.add(dairyManager);
        director.add(confectioneryManager);
        director.add(directorSecretary1);
        director.add(directorSecretary2);


        // meat department
        Salesperson meatSalesperson1 = new Salesperson("Alice", 20_000);
        Salesperson meatSalesperson2 = new Salesperson("Tom", 20_000);
        Salesperson meatSalesperson3 = new Salesperson("Sarah", 20_000);

        meatManager.add(meatSalesperson1);
        meatManager.add(meatSalesperson2);
        meatManager.add(meatSalesperson3);


        // dairy department
        Salesperson dairySalesperson1 = new Salesperson("Emma", 24_000);
        Salesperson dairySalesperson2 = new Salesperson("Lucas", 24_000);
        Salesperson dairySalesperson3 = new Salesperson("Mia", 24_000);

        dairyManager.add(dairySalesperson1);
        dairyManager.add(dairySalesperson2);
        dairyManager.add(dairySalesperson3);

        // confectionery department
        Salesperson confectionerySalesperson1 = new Salesperson("Olivia", 17_000);
        Salesperson confectionerySalesperson2 = new Salesperson("Liam", 17_000);
        Salesperson confectionerySalesperson3 = new Salesperson("Sophia", 17_000);

        confectioneryManager.add(confectionerySalesperson1);
        confectioneryManager.add(confectionerySalesperson2);
        confectioneryManager.add(confectionerySalesperson3);

        director.payExpenses();
    }
}
