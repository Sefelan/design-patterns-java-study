package cars;

public class Wheel {
    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }

    final private Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса

    public static class Builder {
        private Material material = Material.Steel;
        private int diameter = 17;

        public Builder setMaterial(Material material) {
            this.material = material;
            return this;
        }

        public Builder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public Wheel build() {
            return new Wheel(material,diameter);
        }

    }

    private Wheel(Material material,
                 int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{\n" +
                "\t\tmaterial=" + material + ",\n" +
                "\t\tdiameter=" + diameter + "\n" +
                "\t}";
    }
}
