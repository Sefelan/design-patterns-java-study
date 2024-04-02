import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем медиатор
        AirTrafficControl airTrafficControl = new AirTrafficControl("sad");

        Runway mainRunway = new Runway("Main runway");
        Runway secondaryRunway = new Runway("Secondary runway");

        airTrafficControl.addRunway(mainRunway);
        airTrafficControl.addRunway(secondaryRunway);

        ArrayList<Plane> planes = new ArrayList<>();
        Plane plane17 = new Plane(17);
        Plane plane23 = new Plane(23);
        Plane plane31 = new Plane(31);
        Plane plane45 = new Plane(45);
        Plane plane53 = new Plane(53);
        Plane plane8 = new Plane(8);

        planes.add(plane17);
        planes.add(plane23);
        planes.add(plane31);
        planes.add(plane45);
        planes.add(plane53);
        planes.add(plane8);

        for (Plane plane: planes) {
            airTrafficControl.addToHangar(plane);
            plane.setMediator(airTrafficControl);
        }

        plane17.requestRunway();
        plane23.requestRunway();
        plane45.requestRunway();
        plane17.takeOff();

        plane45.requestRunway();
        plane45.takeOff();
        plane53.takeOff();

    }
}
