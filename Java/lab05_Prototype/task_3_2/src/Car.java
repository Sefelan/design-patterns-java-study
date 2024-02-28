public class Car implements ClonableObject{
    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV         //  Кросовер
    }

    final private Type type;                    //  Тип кузову
    final private CarColor carColor;            //  Колір
    final private Engine engine;                //  Двигун
    final private Wheel wheel;                  //  Колеса
    final private Transmission transmission;    //  Трансмісія

    public static class Builder {
        private Type type = Type.Sedan;
        private CarColor carColor = CarColor.Black;
        private Engine engine = new Engine.Builder().build();
        private Wheel wheel = new Wheel.Builder().build();
        private Transmission transmission= new Transmission.Builder().build();

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

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

        public Builder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(type, carColor, engine, wheel, transmission);
        }
    }

    private Car(Type type, CarColor carColor,
                Engine engine, Wheel wheel, Transmission transmission) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }

    private Car(Car otherCar) {
        this.type = otherCar.type;
        this.carColor = otherCar.carColor;
        this.engine = otherCar.engine;
        this.wheel = otherCar.wheel;
        this.transmission = otherCar.transmission;
    }

    @Override
    public Object copy() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n\ttype=" + type +
                ",\n\tcarColor=" + carColor +
                ",\n\tengine=" + engine +
                ",\n\twheel=" + wheel +
                ",\n\ttransmission=" + transmission +
                "\n}"+ "(" + super.toString() + ")";
    }
}
