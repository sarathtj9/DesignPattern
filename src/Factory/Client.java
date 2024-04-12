package Factory;

import Factory.components.button.Button;
import Factory.components.menu.Menu;

public class Client {

    public static void main(String[] args) {


        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.IOS);

        Button button = uiFactory.createButton();

        Menu menu = uiFactory.creatMenu();

        button.click();

        menu.checkMenu();
    }
}
