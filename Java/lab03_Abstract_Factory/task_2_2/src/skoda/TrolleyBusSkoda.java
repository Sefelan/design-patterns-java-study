package skoda;

import transport.TrolleyBus;

public class TrolleyBusSkoda implements TrolleyBus {
    private final int cost;       // Вартість одиниці транспорту
    private final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

    protected TrolleyBusSkoda(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByContactNetwork() {
        System.out.println("Skoda trolleybus runs");
    }
}
