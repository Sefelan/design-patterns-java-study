import cars.Car;
import cars.SingletonCarDirector;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingletonCarDirector singletonCarDirector = SingletonCarDirector.getInstance();
        SingletonCarDirector singletonCarDirector2 = SingletonCarDirector.getInstance();

        Car corsa = singletonCarDirector.createCorsa();
        Car rav4 = singletonCarDirector2.createRAV4();
        Car teslaM3 = singletonCarDirector2.createTeslaM3();

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
