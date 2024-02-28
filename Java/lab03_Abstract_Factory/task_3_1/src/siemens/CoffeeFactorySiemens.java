package siemens;

import coffee.*;

public class CoffeeFactorySiemens implements CoffeeFactory {
    @Override
    public Americano createAmericano() {
        return new AmericanoSiemens();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new CappuccinoSiemens();
    }

    @Override
    public Espresso createEspresso() {
        return new EspressoSiemens();
    }

    @Override
    public Latte createlatte() {
        return new LatteSiemens();
    }
}
