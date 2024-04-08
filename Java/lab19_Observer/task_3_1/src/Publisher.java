import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(String context) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this, context);
        }
    }
}