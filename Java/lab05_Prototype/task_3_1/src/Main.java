import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        CreatorEquation creatorEquation = new CreatorEquation();
        CreatorEquationQuadratic creatorEquationQuadratic = new CreatorEquationQuadratic();
        CreatorEquationBiQuadratic creatorEquationBiQuadratic = new CreatorEquationBiQuadratic();

        Creator creator = null;
        Equation equation;

        List<Equation> equations = new ArrayList<>();
        List<Double> coefficients = new ArrayList<>();

        String filePath = "./tests/input01.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            coefficients.clear();
            String[] parts = line.trim().split("\\s+");
            for (String part : parts) {coefficients.add(Double.parseDouble(part));}

            if      (coefficients.size() == 2) {creator = creatorEquation;}
            else if (coefficients.size() == 3) {creator = creatorEquationQuadratic;}
            else if (coefficients.size() == 5) {creator = creatorEquationBiQuadratic;}

            equation = creator.createEquation(coefficients);
            equations.add(equation);
        }
        br.close();

        Equation currEquation;
        Equation copyEquation;
        for (int i = 0; i < 7; i++) {
            currEquation = equations.get(i);
            copyEquation = currEquation.clone();
            System.out.println(currEquation);
            System.out.println(copyEquation + "\n");
        }

    }
}