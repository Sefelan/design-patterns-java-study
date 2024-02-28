import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solver {
    public void solveTxt(String filePath) throws IOException {


        CreatorEquation creatorEquation = new CreatorEquation();
        CreatorEquationQuadratic creatorEquationQuadratic = new CreatorEquationQuadratic();
        CreatorEquationBiQuadratic creatorEquationBiQuadratic = new CreatorEquationBiQuadratic();


        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        List<Double> coefficients = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            coefficients = new ArrayList<>();
            String[] parts = line.trim().split("\\s+");
            for (String part : parts) {coefficients.add(Double.parseDouble(part));}
            if (coefficients.size()==2){
                System.out.println(2);
            }
            else if (coefficients.size()==3){
                System.out.println(3);
            }
            else if (coefficients.size()==5){
                System.out.println(5);
            }
        }
        br.close();
    }
    public void findRoots(Creator creator){

    }
}
