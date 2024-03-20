import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CarSimulator {

    final static private Car.Builder carBuilder = new Car.Builder();
    final static private EngineCache engineCache = new EngineCache();
    final static private WheelCache wheelCache = new WheelCache();

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(CarSimulator::createRandomCar, 0, 2, TimeUnit.SECONDS);

    }

    private static void createRandomCar() {
        Random random = new Random();

        Car.CarColor color = Car.CarColor.values()[random.nextInt(Car.CarColor.values().length)];
        int power = random.nextInt(11, 15) * 10;
        Engine.Fuel fuel = Engine.Fuel.values()[random.nextInt(Engine.Fuel.values().length)];
        int wheel_diameter = random.nextInt(17, 20);

        Car car = carBuilder
                .setCarColor(color)
                .setEngine(engineCache.getEngine(power, fuel))
                .setWheel(wheelCache.getWheel(wheel_diameter))
                .build();

        System.out.println(car);
    }
}