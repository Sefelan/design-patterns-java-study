public class Plane extends Component {
    private int id;
    private Runway clearRunway;

    public Plane(int id) {
        this.id = id;

    }

    public void setClearRunway(Runway clearRunway) {
        this.clearRunway = clearRunway;
    }

    public Runway getClearRunway() {
        return clearRunway;
    }

    public void requestRunway() {
        mediator.handleMessage(this, "Requesting runway");
    }

    public void takeOff() {
        if (clearRunway != null) {
            System.out.println("Plane " + id + " is taking off...");
            clearRunway.setAvailable(true);
            clearRunway = null;
        } else {
            System.out.println("Plane " + id + " does not have clear runway access");
        }
    }

    public void land() {
        if (clearRunway != null) {
            System.out.println("Plane " + id + " is landing...");
            clearRunway.setAvailable(true);
            clearRunway = null;
        } else {
            System.out.println("Plane " + id + " does not have clear runway access");
        }
    }

    @Override
    public String getComponentName() {
        return "Plane " + id;
    }
}
