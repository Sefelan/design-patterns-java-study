package hyundai;

import transport.Bus;

public class BusHyundai implements Bus {
    private final int cost;       // Вартість одиниці транспорту
    private final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

    protected BusHyundai(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByWay() {
        System.out.println("Hyundai bus runs!");
    }
}
