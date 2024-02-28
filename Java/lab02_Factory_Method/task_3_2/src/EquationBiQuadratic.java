import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class EquationBiQuadratic extends Equation {
    protected double a;

    public EquationBiQuadratic(List<Double> coefficients) {
        super(List.of(coefficients.get(2), coefficients.get(4)));
        this.a = coefficients.get(0);
    }

    @Override
    public Optional<List<Double>> solve() {
        List<Double> doubleRoots = new ArrayList<>();
        if (a == 0 && c == 0) {
            return super.solve();
        } else {
            List<Double> roots = new ArrayList<>();
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double sqrtDiscriminant = Math.sqrt(discriminant);
                doubleRoots.add((-b + sqrtDiscriminant) / (2 * a));
                doubleRoots.add((-b - sqrtDiscriminant) / (2 * a));
            } else if (discriminant == 0) {
                doubleRoots.add(-b / (2 * a));
            } else {
                return Optional.empty();
            }
            for (Double root : doubleRoots) {
                if (root > 0) {
                    roots.add(Math.sqrt(root));
                    roots.add(-Math.sqrt(root));
                }
                if (root == 0 && !roots.contains(0.0)) {
                    roots.add(0.0);
                }
            }
            if (roots.isEmpty()) {
                return Optional.empty();
            } else {
                return Optional.of(roots);
            }
        }
    }
}