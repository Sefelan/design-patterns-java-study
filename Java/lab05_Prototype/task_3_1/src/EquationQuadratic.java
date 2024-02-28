import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class EquationQuadratic extends Equation implements Cloneable {
    protected double a;

    public EquationQuadratic(List<Double> coefficients) {
        super(List.of(coefficients.get(1), coefficients.get(2)));
        this.a = coefficients.get(0);
    }

    public EquationQuadratic(double a, double b,double c) {
        super(b,c);
        this.a = a;
    }

    @Override
    public Optional<List<Double>> solve() {
        List<Double> roots = new ArrayList<>();
        if (a == 0) {
            return super.solve();
        }
        else{
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double sqrtDiscriminant = Math.sqrt(discriminant);
                roots.add((-b + sqrtDiscriminant) / (2 * a));
                roots.add((-b - sqrtDiscriminant) / (2 * a));
                return Optional.of(roots);
            }
            else if (discriminant == 0) {
                roots.add(-b / (2 * a));
                return Optional.of(roots);
            }
            else {
                return Optional.empty();
            }
        }
    }

    @Override
    public EquationQuadratic clone() {
        return new EquationQuadratic(a,b,c);
    }

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0 (" + super.toString()+")";
    }
}
