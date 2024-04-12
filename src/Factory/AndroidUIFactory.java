package Factory;

import Factory.components.button.AndroidButton;
import Factory.components.button.Button;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu creatMenu() {
        return new AndroidMenu();
    }
}
