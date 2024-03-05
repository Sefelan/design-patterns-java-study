package buttons;

import buttonsizes.ButtonSize;
import usersize.UserSize;

public abstract class Button {
    protected ButtonSize buttonSize;
    protected UserSize userSize;

    public Button(ButtonSize buttonSize, UserSize userSize) {
        this.buttonSize = buttonSize;
        this.userSize = userSize;
    }

    public void draw(){
        System.out.println("Setting size to " + buttonSize.getButtonSize());
        System.out.println("Setting user size to " + userSize.getUserSize());
    };
}
