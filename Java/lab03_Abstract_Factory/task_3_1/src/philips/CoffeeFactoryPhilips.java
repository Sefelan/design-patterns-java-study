package philips;

import coffee.*;

public class CoffeeFactoryPhilips implements CoffeeFactory {
    @Override
    public Americano createAmericano() {
        return new AmericanoPhilips();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new CappuccinoPhilips();
    }

    @Override
    public Espresso createEspresso() {
        return new EspressoPhilips();
    }

    @Override
    public Latte createlatte() {
        return new LattePhilips();
    }
}
