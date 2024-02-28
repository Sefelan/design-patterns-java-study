public class CarDirector {
    Car createRAV4() {
        Engine engine = new Engine.Builder()
                .setPower(203)
                .setTorque(184)
                .setVolume(2.5f)
                .build();

        Wheel wheel = new Wheel.Builder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .build();

        Transmission transmission = new Transmission.Builder()
                .setType(Transmission.Type.Automatic)
                .setGears(8)
                .build();

        Car rav4 = new Car.Builder()
                .setType(Car.Type.SUV)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();

        return rav4;
    }

    Car createCorsa() {
        Engine engine = new Engine.Builder()
                .setPower(100)
                .setTorque(170)
                .setVolume(1.2f)
                .build();

        Wheel wheel = new Wheel.Builder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(16)
                .build();

        Transmission transmission = new Transmission.Builder()
                .setType(Transmission.Type.Automatic)
                .setGears(6)
                .build();

        Car corsa = new Car.Builder()
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Grey)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();

        return corsa;
    }

    Car createTeslaM3() {
        Engine engine = new Engine.Builder()
                .setPower(283)
                .setTorque(450)
                .setFuel(Engine.Fuel.Electric)
                .setVolume(0f)
                .build();

        Wheel wheel = new Wheel.Builder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .build();

        Transmission transmission = new Transmission.Builder()
                .setType(Transmission.Type.Automatic)
                .setGears(1)
                .build();

        Car teslaM3 = new Car.Builder()
                .setType(Car.Type.Sedan)
                .setCarColor(Car.CarColor.Red)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .build();

        return teslaM3;
    }
}
