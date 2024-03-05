import buttons.*;
import buttonsizes.*;
import usersize.CustomUserSize;
import usersize.StandardUserSize;

public class Canvas {
    public static void main(String[] args) {
        Button checkboxButton = new CheckboxButton(new SmallButton(), new StandardUserSize());
        checkboxButton.draw();

        Button radioButton = new RadioButton(new MediumButton(), new StandardUserSize());
        radioButton.draw();

        Button dropdownButton = new DropdownButton(new LargeButton(), new CustomUserSize(15));
        dropdownButton.draw();

        Button imageButton = new ImageButton(new MediumButton(), new CustomUserSize(20));
        imageButton.draw();
    }
}
