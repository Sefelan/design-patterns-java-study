package skoda;

import transport.*;

public class TransportFactorySkoda implements TransportFactory {
    final int busCost = 4_500_000;
    final int busUsageCost = 25;

    final int tramCost = 9_000_000;
    final int tramUsageCost = 8;

    final int trolleyBusCost = 6_800_000;
    final int trolleyBusUsageCost = 12;


    @Override
    public Bus createBus() {
        return new BusSkoda(busCost, busUsageCost);
    }

    @Override
    public Tram createTram() {
        return new TramSkoda(tramCost, tramUsageCost);
    }

    @Override
    public TrolleyBus createTrolleybus() {
        return new TrolleyBusSkoda(trolleyBusCost, trolleyBusUsageCost);
    }
}
