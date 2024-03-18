public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " + milk";
    }

    @Override
    public float cost() {
        return super.cost() + 0.5f;
    }
}
