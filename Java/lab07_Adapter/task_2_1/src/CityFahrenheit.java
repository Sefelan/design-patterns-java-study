public class CityFahrenheit extends City {

    public CityFahrenheit(String name, double temperature) {
        super(name, temperature);
    }

    public String getTemperatureUnit() {
        return "Fahrenheit";
    }
}
