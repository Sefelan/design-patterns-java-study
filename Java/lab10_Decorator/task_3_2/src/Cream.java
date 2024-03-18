public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " + cream";
    }

    @Override
    public float cost() {
        return super.cost() + 0.7f;
    }
}
