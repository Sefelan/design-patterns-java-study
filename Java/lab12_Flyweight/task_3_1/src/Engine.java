public class Engine {
    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    final int power;    //  Потужність
    final Fuel fuel;     //  Вид пального

    public static class Builder {
        private int power = 150;
        private Fuel fuel = Fuel.Petrol;

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Engine build() {
            return new Engine(power, fuel);
        }
    }

    private Engine(int power, Fuel fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine (" + super.toString() + ") {\n" +
                "\t\tpower=" + power + ",\n" +
                "\t\tfuel=" + fuel + ",\n" +
                "\t}";
    }
}