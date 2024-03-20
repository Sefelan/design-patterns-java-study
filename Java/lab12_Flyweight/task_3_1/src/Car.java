public class Car {
    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    final private CarColor carColor;            //  Колір
    final private Engine engine;                //  Двигун
    final private Wheel wheel;                  //  Колеса

    public static class Builder {
        private CarColor carColor = CarColor.Black;
        private Engine engine = new Engine.Builder().build();
        private Wheel wheel = new Wheel.Builder().build();

        public Builder setCarColor(CarColor carColor) {
            this.carColor = carColor;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        public Car build() {
            return new Car(carColor, engine, wheel);
        }

        public Builder reset() {
            carColor = Car.CarColor.White;
            engine = new Engine.Builder().build();
            wheel = new Wheel.Builder().build();
            return this;
        }

        public Builder() {
            reset();
        }
    }

    private Car(CarColor carColor,
                Engine engine, Wheel wheel) {
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                ",\n\tcarColor=" + carColor +
                ",\n\tengine=" + engine +
                ",\n\twheel=" + wheel +
                "\n}";
    }
}