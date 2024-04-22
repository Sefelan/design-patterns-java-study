import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        System.out.println("\nEverything is fine:)");
        for (MilitaryObject militaryObject : militaryObjects) {
            System.out.println(militaryObject);
        }

        System.out.println("\nHere comes the spy...");
        Spy secretAgent = new SecretAgent();
        for (MilitaryObject militaryObject : militaryObjects) {
            militaryObject.overLook(secretAgent);
        }

        System.out.println("\nAnd now, the saboteur strikes!");
        Saboteur saboteur = new Saboteur();
        for (MilitaryObject militaryObject : militaryObjects) {
            militaryObject.overLook(saboteur);
        }

    }

}
