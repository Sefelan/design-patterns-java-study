import java.util.HashMap;
import java.util.Map;

public class EngineCache {
    final private Map<String, Engine> engineCache = new HashMap<>();

    public Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        Engine engine = engineCache.get(key);
        if (engine == null) {
            engine = new Engine.Builder()
                    .setPower(power)
                    .setFuel(fuel)
                    .build();
            engineCache.put(key,engine);
            System.out.println("Creating New Engine " + key);
        }
        else{
            System.out.println("Nice, using existing Engine!");
        }
        return engine;
    }
}
