public class GeneralStaff implements MilitaryObject {

    /**
     * Кількість генералів на військовій базі
     */
    private int generals;

    /**
     * Кількість секретних паперів на військовій базі
     */
    private int secretPapers;

    public GeneralStaff(int generals, int secretPapers) {
        this.generals = generals;
        this.secretPapers = secretPapers;
    }

    public int getGenerals() {
        return generals;
    }

    public void setGenerals(int generals) {
        this.generals = generals;
    }

    public int getSecretPapers() {
        return secretPapers;
    }

    public void setSecretPapers(int secretPapers) {
        this.secretPapers = secretPapers;
    }

    @Override
    public String toString() {
        return "GeneralStaff{" +
                "generals=" + generals +
                ", secretPapers=" + secretPapers +
                '}';
    }

    @Override
    public void overLook(Spy spy) {
        spy.visit(this);
    }
}
