package Factory;

import Factory.components.button.AndroidButton;
import Factory.components.button.Button;
import Factory.components.button.WindowsButton;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;
import Factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu creatMenu() {
        return new WindowsMenu();
    }
}
