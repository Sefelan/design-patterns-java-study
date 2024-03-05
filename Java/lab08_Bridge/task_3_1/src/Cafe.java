import beverages.*;
import locations.*;
import milkadditives.*;

public class Cafe {

    public static void main(String[] args) {
        Beverage blackChocolate = new Chocolate(3, new WithoutMilk(), new IndoorConsumption());
        Beverage blackCoffee = new Coffee(3, new WithoutMilk(), new OutdoorConsumption());
        Beverage blackTea = new Tea(0, new WithoutMilk(), new IndoorConsumption());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTea);

        Beverage milkChocolate = new Chocolate(3, new WithMilk(50), new IndoorConsumption());
        Beverage coffeeWithMilk = new Coffee(3, new WithMilk(10), new IndoorConsumption());
        Beverage teeWithMilk = new Tea(2, new WithMilk(10), new OutdoorConsumption());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
