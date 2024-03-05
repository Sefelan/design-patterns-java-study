package buttons;

import buttonsizes.ButtonSize;
import usersize.UserSize;

public class ImageButton extends Button {
    public ImageButton(ButtonSize buttonSize, UserSize userSize) {
        super(buttonSize, userSize);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing an image button.\n");
    }
}
