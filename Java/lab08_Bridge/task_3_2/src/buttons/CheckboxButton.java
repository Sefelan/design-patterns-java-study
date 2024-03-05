package buttons;

import buttonsizes.ButtonSize;
import usersize.UserSize;

public class CheckboxButton extends Button {
    public CheckboxButton(ButtonSize buttonSize, UserSize userSize) {
        super(buttonSize, userSize);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a checkbox button.\n");
    }
}
