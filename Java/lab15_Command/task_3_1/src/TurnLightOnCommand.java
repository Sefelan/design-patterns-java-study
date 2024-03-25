import java.util.Arrays;
import java.util.List;

public class TurnLightOnCommand implements Command {
    private List<Lamp> lamps;

    public TurnLightOnCommand(Lamp lamp) {
        this.lamps = Arrays.asList(lamp);
    }

    public TurnLightOnCommand(List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.lightOn();
        }
    }
}
