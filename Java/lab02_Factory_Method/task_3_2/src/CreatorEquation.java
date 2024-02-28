import java.util.List;

public class CreatorEquation implements Creator {
    @Override
    public Equation createEquation(List<Double> coefficients) {
        return new Equation(coefficients);
    }
}
