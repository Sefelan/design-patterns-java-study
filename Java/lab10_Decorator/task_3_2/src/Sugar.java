public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " + sugar";
    }

    @Override
    public float cost() {
        return super.cost() + 0.2f;
    }
}
