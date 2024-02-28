import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        Car corsa = carDirector.createCorsa();
        Car rav4 = carDirector.createRAV4();
        Car teslaM3 = carDirector.createTeslaM3();

        List<Car> cars = new ArrayList<>();
        cars.add(corsa);
        cars.add(rav4);
        cars.add(teslaM3);


        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.copy()+"\n");
        }
    }
}
