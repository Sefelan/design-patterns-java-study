public class CityCelsius extends City {

    public CityCelsius(String name, double temperature) {
        super(name, temperature);
    }

    public String getTemperatureUnit() {
        return "Celsius";
    }
}
