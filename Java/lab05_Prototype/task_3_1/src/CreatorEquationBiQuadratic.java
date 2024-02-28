import java.util.List;

public class CreatorEquationBiQuadratic implements Creator {
    @Override
    public Equation createEquation(List<Double> coefficients) {
        return new EquationBiQuadratic(coefficients);
    }
}
