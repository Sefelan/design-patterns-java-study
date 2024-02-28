package volvo;

import transport.*;

public class TransportFactoryVolvo implements TransportFactory {
    final int busCost = 6_000_000;
    final int busUsageCost = 20;

    final int tramCost = 10_000_000;
    final int tramUsageCost = 7;

    final int trolleyBusCost = 7_000_000;
    final int trolleyBusUsageCost = 13;


    @Override
    public Bus createBus() {
        return new BusVolvo(busCost, busUsageCost);
    }

    @Override
    public Tram createTram() {
        return new TramVolvo(tramCost, tramUsageCost);
    }

    @Override
    public TrolleyBus createTrolleybus() {
        return new TrolleyBusVolvo(trolleyBusCost, trolleyBusUsageCost);
    }
}
