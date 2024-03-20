import java.util.HashMap;
import java.util.Map;

public class WheelCache {
    final private Map<Integer, Wheel> wheelCache = new HashMap<>();

    public Wheel getWheel(int diameter) {
        Wheel wheel = wheelCache.get(diameter);
        if (wheel == null) {
            wheel = new Wheel.Builder()
                    .setDiameter(diameter)
                    .build();
            wheelCache.put(diameter,wheel);
            System.out.println("Creating New Wheel " + diameter);
        }
        else {
            System.out.println("Nice, using existing Wheel!");
        }
        return wheel;
    }
}