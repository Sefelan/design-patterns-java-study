import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Car {


    public Engine engine;
    public List<Wheel> wheels= new ArrayList<>();
    public Random random = new Random();

    public void setEngine(Engine engine) {this.engine = engine;}
    public void setWheels(List<Wheel> wheels) {this.wheels = wheels;}

    public void drive() {
        if (engine != null && wheels != null) {
            System.out.println("Car drives " + engine.getPower() + " km/h on " + wheels.size() + " wheels");

        } else {
            System.out.println("Your car broke down and cannot drive without wheels and engine.");
        }
    }

    //Не потрібні методи для отримання зв'язку "композиція"
    public void installRandomEngine(){
        int power = random.nextInt(300);
        engine = new Engine(power);
    }

    public void installRandomWheels(int numWheels){
        for (int i = 0; i<numWheels; i++){
            int wheelSize = random.nextInt(15);
            wheels.add(new Wheel(wheelSize));
        }
    }


}
