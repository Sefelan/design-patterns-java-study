public class BeverageDecorator extends Beverage {
    final private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description();
    }

    @Override
    public float cost() {
        return beverage.cost();
    }
}
