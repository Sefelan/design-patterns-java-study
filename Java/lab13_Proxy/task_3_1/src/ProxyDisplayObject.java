public class ProxyDisplayObject implements DisplayObject {
    private DisplayObject displayObject;
    final private String path;

    public ProxyDisplayObject(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (displayObject == null) {
            displayObject = new ImageFile(path);
        }
        displayObject.display();
    }
}
