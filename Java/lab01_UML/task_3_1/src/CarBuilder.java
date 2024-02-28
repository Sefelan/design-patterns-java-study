import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CarBuilder {
    public Random random = new Random();

    public Car buildRandomCar(Car car){
        int power = random.nextInt(300);
        Engine engine = new Engine(power);

        int numWheels = random.nextInt(1,8);
        List<Wheel> wheels= new ArrayList<>();
        for (int i = 0; i<numWheels; i++){
            int wheelSize = random.nextInt(15);
            wheels.add(new Wheel(wheelSize));
        }

        car.setEngine(engine);
        car.setWheels(wheels);
        return car;
    }



}
