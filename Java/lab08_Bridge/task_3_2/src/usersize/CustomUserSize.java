package usersize;

public class CustomUserSize implements UserSize {
    int size;

    public CustomUserSize(int size) {
        this.size = size;
    }

    @Override
    public String getUserSize() {
        return size + " size";
    }
}
