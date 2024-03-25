import java.util.Arrays;
import java.util.List;

public class TurnLightOffCommand implements Command {
    private List<Lamp> lamps;

    public TurnLightOffCommand(Lamp lamp) {
        this.lamps = Arrays.asList(lamp);
    }

    public TurnLightOffCommand(List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.lightOff();
        }
    }
}
