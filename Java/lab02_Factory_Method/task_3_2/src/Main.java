import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {

        CreatorEquation creatorEquation = new CreatorEquation();
        CreatorEquationQuadratic creatorEquationQuadratic = new CreatorEquationQuadratic();
        CreatorEquationBiQuadratic creatorEquationBiQuadratic = new CreatorEquationBiQuadratic();

        Creator creator = null;
        Equation equation;

        List<Double> coefficients = new ArrayList<>();
        Optional<List<Double>> roots;

        String filePath = "./tests/input03.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        List<List<Double>> noSolutionEquations = new ArrayList<>();
        List<List<Double>> oneSolutionEquations = new ArrayList<>();
        List<List<Double>> twoSolutionsEquations = new ArrayList<>();
        List<List<Double>> threeSolutionsEquations = new ArrayList<>();
        List<List<Double>> fourSolutionsEquations = new ArrayList<>();
        List<List<Double>> infiniteSolutionsEquations = new ArrayList<>();

        Double smallestSolution = null;
        Double largestSolution = null;
        List<Double> equationWithSmallestSolution = null;
        List<Double> equationWithLargestSolution = null;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            coefficients.clear();
            String[] parts = line.trim().split("\\s+");
            for (String part : parts) {coefficients.add(Double.parseDouble(part));}

            if (coefficients.size() == 2) {creator = creatorEquation;}
            else if (coefficients.size() == 3) {creator = creatorEquationQuadratic;}
            else if (coefficients.size() == 5) {creator = creatorEquationBiQuadratic;}

            equation = creator.createEquation(coefficients);
            roots = equation.solve();

            if (!roots.isPresent()) {
                noSolutionEquations.add(new ArrayList<>(coefficients));
            } else if (roots.get().isEmpty()) {
                infiniteSolutionsEquations.add(new ArrayList<>(coefficients));
            } else {
                int size = roots.get().size();
                switch (size) {
                    case 1:
                        oneSolutionEquations.add(new ArrayList<>(coefficients));
                        Double solution = roots.get().get(0);
                        if (smallestSolution == null || solution < smallestSolution) {
                            smallestSolution = solution;
                            equationWithSmallestSolution = new ArrayList<>(coefficients);
                        }
                        if (largestSolution == null || solution > largestSolution) {
                            largestSolution = solution;
                            equationWithLargestSolution = new ArrayList<>(coefficients);
                        }
                        break;
                    case 2:
                        twoSolutionsEquations.add(new ArrayList<>(coefficients));
                        break;
                    case 3:
                        threeSolutionsEquations.add(new ArrayList<>(coefficients));
                        break;
                    case 4:
                        fourSolutionsEquations.add(new ArrayList<>(coefficients));
                        break;
                }
            }
        }
        br.close();

        System.out.println("No solution equations: " + noSolutionEquations);
        System.out.println("One solution equations: " + oneSolutionEquations);
        System.out.println("Two solutions equations: " + twoSolutionsEquations);
        System.out.println("Three solutions equations: " + threeSolutionsEquations);
        System.out.println("Four solutions equations: " + fourSolutionsEquations);
        System.out.println("Infinite solutions equations: " + infiniteSolutionsEquations);

        if (equationWithSmallestSolution != null) {
            System.out.println("Equation with the smallest solution: " + equationWithSmallestSolution + ", solution: " + smallestSolution);
        }
        if (equationWithLargestSolution != null) {
            System.out.println("Equation with the largest solution: " + equationWithLargestSolution + ", solution: " + largestSolution);
        }
    }
}