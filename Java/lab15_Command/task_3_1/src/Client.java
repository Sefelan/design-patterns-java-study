import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Command kitchenLampOn = new TurnLightOnCommand(kitchenLamp);
        Command kitchenLampOff = new TurnLightOffCommand(kitchenLamp);

        controllerKitchenLamp.setCommandOn(kitchenLampOn);
        controllerKitchenLamp.setCommandOff(kitchenLampOff);

        Controller controllerHallLamp = new Controller();
        Command hallLampOn = new TurnLightOnCommand(hallLamp);
        Command hallLampOff = new TurnLightOffCommand(hallLamp);

        controllerHallLamp.setCommandOn(hallLampOn);
        controllerHallLamp.setCommandOff(hallLampOff);

        Controller controllerBedroomLamp = new Controller();
        Command bedroomLampOn = new TurnLightOnCommand(bedroomLamp);
        Command bedroomLampOff = new TurnLightOffCommand(bedroomLamp);

        controllerBedroomLamp.setCommandOn(bedroomLampOn);
        controllerBedroomLamp.setCommandOff(bedroomLampOff);

        Controller controllerBathroomLamp = new Controller();
        Command bathroomLampOn = new TurnLightOnCommand(bathroomLamp);
        Command bathroomLampOff = new TurnLightOffCommand(bathroomLamp);

        controllerBathroomLamp.setCommandOn(bathroomLampOn);
        controllerBathroomLamp.setCommandOff(bathroomLampOff);

        List<Lamp> allLamps = Arrays.asList(kitchenLamp, hallLamp, bedroomLamp, bathroomLamp);
        Controller controllerUniversal = new Controller();
        Command allLightsOn = new TurnLightOnCommand(allLamps);
        Command allLightsOff = new TurnLightOffCommand(allLamps);

        controllerUniversal.setCommandOn(allLightsOn);
        controllerUniversal.setCommandOff(allLightsOff);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
