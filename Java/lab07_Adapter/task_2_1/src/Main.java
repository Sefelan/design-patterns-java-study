public class Main {

    public static void main(String[] args) {

        // Спостережна станція
        WeatherWarnings weatherWarnings = new WeatherWarnings(16, 100);     // допустима температура визначається в межах
                                                                            // допустима температура визначається в межах
                                                                            // від 16 до 100 градусів по Фаренгейту
                                                                            // тобто від -8.89 до 37.78 градусів по Цельсію

        City[] cityArray = {
                new CityFahrenheit("Chicago", 16),  // 16 градусів по Фаренгейту
                new CityFahrenheit("Phoenix", 104), // 104 градуси по Фаренгейту
                new CityFahrenheit("Portland", 70), // 70 градусів по Фаренгейту
                new CityCelsius("Seoul", 50),       // 50 градусів по Цельсію це 122 градуси по Фаренгейту
                new CityCelsius("Hanoi", 7)         // 7 градусів по Цельсію це 44.89 градусів по Фаренгейту
        };

        System.out.println();
        for (City city : cityArray) {
            weatherWarnings.postWarning(city);
        }

        System.out.println("\n============ Cities with weather warnings ====================\n");
        for (City city : cityArray) {
            if (city.getHasWeatherWarning()){
                System.out.printf("%s has temperature warning! Temperature is %s %s\n",
                        city.getName(), city.getTemperature(), city.getTemperatureUnit());
            }
        }

    }
}
