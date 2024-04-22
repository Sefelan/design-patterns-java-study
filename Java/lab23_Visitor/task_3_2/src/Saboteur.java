public class Saboteur implements Spy {

    @Override
    public void visit(MilitaryBase militaryBase) {
        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);
        System.out.println("The Saboteur has destroyed the military base.");
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        generalStaff.setGenerals(0);
        generalStaff.setSecretPapers(0);
        System.out.println("The Saboteur has obliterated the General Staff's headquarters, wiping out all Russians.");
    }
}
