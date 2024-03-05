package locations;

public class IndoorConsumption implements ConsumptionLocation {
    @Override
    public String getLocationInfo() {
        return "inside";
    }
}
