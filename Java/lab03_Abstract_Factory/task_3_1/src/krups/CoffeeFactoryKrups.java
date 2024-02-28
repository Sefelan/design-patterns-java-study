package krups;

import coffee.*;

public class CoffeeFactoryKrups implements CoffeeFactory {
    @Override
    public Americano createAmericano() {
        return new AmericanoKrups();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new CappuccinoKrups();
    }

    @Override
    public Espresso createEspresso() {
        return new EspressoKrups();
    }

    @Override
    public Latte createlatte() {
        return new LatteKrups();
    }
}
