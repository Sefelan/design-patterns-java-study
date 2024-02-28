import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class Equation {
    protected double b;
    protected double c;

    public Equation(List<Double> coefficients) {
        this.b = coefficients.get(0);
        this.c = coefficients.get(1);
    }

    public Optional<List<Double>> solve() {
        List<Double> roots = new ArrayList<>();
        if (b == 0) {
            if (c == 0) {return Optional.of(new ArrayList<>());}
            else {return Optional.empty();}
        }
        else {
            roots.add(-c / b);
            return Optional.of(roots);
        }
    }
}



