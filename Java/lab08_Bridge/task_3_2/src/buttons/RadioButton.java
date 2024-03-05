package buttons;

import buttonsizes.ButtonSize;
import usersize.UserSize;

public class RadioButton extends Button {

    public RadioButton(ButtonSize buttonSize, UserSize userSize) {
        super(buttonSize, userSize);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a radio button.\n");
    }
}
