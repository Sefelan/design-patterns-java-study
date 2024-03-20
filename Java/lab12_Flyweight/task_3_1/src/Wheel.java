public class Wheel {
    final int diameter;

    public static class Builder {
        private int diameter = 17;

        public Builder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public Wheel build() {
            return new Wheel(diameter);
        }
    }

    private Wheel(int diameter) {

        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel (" + super.toString() + ") {\n" +
                "\t\tdiameter=" + diameter + "\n" +
                "\t}";
    }
}