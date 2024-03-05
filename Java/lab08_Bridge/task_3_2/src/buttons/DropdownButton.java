package buttons;

import buttonsizes.ButtonSize;
import usersize.UserSize;

public class DropdownButton extends Button {


    public DropdownButton(ButtonSize buttonSize, UserSize userSize) {
        super(buttonSize, userSize);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a dropdown button.\n");
    }
}
