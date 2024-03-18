public class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " + whippedCream";
    }

    @Override
    public float cost() {
        return super.cost() + 1.5f;
    }
}
