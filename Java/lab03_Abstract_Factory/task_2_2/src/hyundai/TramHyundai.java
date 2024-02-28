package hyundai;

import transport.Tram;

public class TramHyundai implements Tram {
    private final int cost;       // Вартість одиниці транспорту
    private final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

    protected TramHyundai(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByRails() {
        System.out.println("Hyundai tram runs!");
    }
}
