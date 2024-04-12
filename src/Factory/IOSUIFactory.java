package Factory;

import Factory.components.button.AndroidButton;
import Factory.components.button.Button;
import Factory.components.button.IOSButton;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu creatMenu() {
        return new IOSMenu();
    }
}
