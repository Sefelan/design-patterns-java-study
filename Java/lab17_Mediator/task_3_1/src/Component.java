public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.handleMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(getComponentName() + " received message " + message);
    }
    abstract String getComponentName();
}
