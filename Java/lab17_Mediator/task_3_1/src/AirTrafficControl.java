import java.util.ArrayList;

public class AirTrafficControl extends Mediator{
    private ArrayList<Plane> planesInFlight;
    private ArrayList<Plane> planesOnGround;
    private ArrayList<Runway> runways = new ArrayList<>();
    final private String airTrafficControlName;

    public AirTrafficControl(String airTrafficControlName) {
        this.airTrafficControlName = airTrafficControlName;
        planesInFlight = new ArrayList<>();
        planesOnGround = new ArrayList<>();
    }

    public void addRunway(Runway runway) {
        runways.add(runway);
    }

    public void addToHangar(Plane plane) {
        planesOnGround.add(plane);
    }

    public void findRunway(Plane plane) {
        Runway clearRunway = null;
        for (Runway runway : runways) {
            if (runway.isAvailable()) {
                clearRunway = runway;
                handleMessage(plane,"Clear for landing on " + runway.getComponentName());
                plane.setClearRunway(clearRunway);
                clearRunway.setAvailable(false);
                break;
            }
        }

    }

    @Override
    void handleMessage(Component sender, String message) {
        if (message.equals("Requesting runway")){
            findRunway((Plane) sender);
        }
    }
}
