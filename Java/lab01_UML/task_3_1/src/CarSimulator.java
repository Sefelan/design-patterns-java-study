import java.util.List;
import java.util.ArrayList;

public class CarSimulator {
    public CarBuilder carBuilder;
    public List<Car> cars;

    public CarSimulator() {
        carBuilder = new CarBuilder();
        cars = new ArrayList<>();
    }
    public void createTraffic(){
        cars.add(new Car());
        for (int i=0; i<10;i++){
            Car newCar = carBuilder.buildRandomCar(new Car());
            cars.add(newCar);
        }
    }
    public void simulateTraffic() {
        for (Car car : cars) {
            car.drive();
        }
    }




}
