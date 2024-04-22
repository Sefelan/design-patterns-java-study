public class SecretAgent implements Spy {
    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("Special Agent has collected the following information:");
        System.out.println("Number of officers: " + militaryBase.getOfficers());
        System.out.println("Number of soldiers: " + militaryBase.getSoldiers());
        System.out.println("Number of jeeps: " + militaryBase.getJeeps());
        System.out.println("Number of tanks: " + militaryBase.getTanks());
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.println("The Special Agent has tracked " + generalStaff.getGenerals() +
                " generals and collected information on " + generalStaff.getSecretPapers() +
                " secret papers.");
    }
}
