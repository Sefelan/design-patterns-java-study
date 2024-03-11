package cars;

public class Engine {
    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    final int power;     //  Потужність
    final int torque;    //  Крутний момент
    final Fuel fuel;     //  Вид пального
    final float volume;  //  Об'єм двигуна

    public static class Builder {
        private int power = 150;
        private int torque = 200;
        private Fuel fuel = Fuel.Petrol;
        private float volume = 2.0f;

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setTorque(int torque) {
            this.torque = torque;
            return this;
        }

        public Builder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder setVolume(float volume) {
            this.volume = volume;
            return this;
        }

        public Engine build() {
            return new Engine(power,torque,fuel,volume);
        }
    }

    private Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{\n" +
                "\t\tpower=" + power + ",\n" +
                "\t\ttorque=" + torque + ",\n" +
                "\t\tfuel=" + fuel + ",\n" +
                "\t\tvolume=" + volume + "\n" +
                "\t}";
    }
}
