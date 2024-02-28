package hyundai;

import transport.*;

public class TransportFactoryHyundai implements TransportFactory {
    final int busCost = 5_500_000;
    final int busUsageCost = 20;

    final int tramCost = 9_500_000;
    final int tramUsageCost = 6;

    final int trolleyBusCost = 7_000_000;
    final int trolleyBusUsageCost = 11;


    @Override
    public Bus createBus() {
        return new BusHyundai(busCost, busUsageCost);
    }

    @Override
    public Tram createTram() {
        return new TramHyundai(tramCost, tramUsageCost);
    }

    @Override
    public TrolleyBus createTrolleybus() {
        return new TrolleyBusHyundai(trolleyBusCost, trolleyBusUsageCost);
    }
}
