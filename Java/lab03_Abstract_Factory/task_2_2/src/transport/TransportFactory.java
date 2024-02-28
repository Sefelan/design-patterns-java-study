package transport;

public interface TransportFactory {
    Bus createBus();
    Tram createTram();
    TrolleyBus createTrolleybus();
}
