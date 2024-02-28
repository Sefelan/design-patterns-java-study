public class WeatherWarningsAdapter extends WeatherWarnings {
    public WeatherWarningsAdapter(double minTemperature, double maxTemperature) {
        super(minTemperature, maxTemperature);
    }

    @Override
    public void postWarning(City city) {
        double temperature;
        if (city.getTemperatureUnit().equals("Celsius")) {
            temperature = city.getTemperature() * 9 / 5 + 32;
        } else if (city.getTemperatureUnit().equals("Fahrenheit")) {
            temperature = city.getTemperature();
        } else {
            throw new IllegalArgumentException("Unknown weather unit type");
        }

        if (temperature >= getMaxTemperature() || temperature <= getMinTemperature()) {
            System.out.println("Warning! Current temperature in " + city.getName()
                    + " is " + city.getTemperature() + " " + city.getTemperatureUnit());
            city.setHasWeatherWarning(true);
        } else {
            System.out.println("Temperature in " + city.getName() + " is OK.");
        }
    }
}