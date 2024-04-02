public class Runway extends Component{
    final private String runwayName;
    private boolean isAvailable;

    public Runway(String runwayName) {
        this.runwayName = runwayName;
        isAvailable = true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getComponentName() {
        return runwayName;
    }
}
