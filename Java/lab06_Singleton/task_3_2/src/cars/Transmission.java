package cars;

public class Transmission {
    public enum Type {  // Тип трансмісії
        Manual,     // Механічна
        Automatic,  // Автоматична
        CVT,        // Варіатор
        DualClutch  // Роботизована з подвійним зчепленням
    }

    final private Type type;  // Тип трансмісії
    final private int gears;  // Кількість передач

    public static class Builder {
        private Type type = Type.Manual;
        private int gears = 5;

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Builder setGears(int gears) {
            this.gears = gears;
            return this;
        }

        public Transmission build() {
            return new Transmission(type, gears);
        }
    }

    private Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{\n" +
                "\t\ttype=" + type + ",\n" +
                "\t\tgears=" + gears + "\n" +
                "\t}";
    }
}
