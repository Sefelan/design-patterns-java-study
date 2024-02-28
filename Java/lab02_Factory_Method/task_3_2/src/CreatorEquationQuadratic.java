import java.util.List;

public class CreatorEquationQuadratic implements Creator {
    @Override
    public Equation createEquation(List<Double> coefficients) {
        return new EquationQuadratic(coefficients);
    }
}
