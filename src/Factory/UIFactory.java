package Factory;


import Factory.components.button.Button;
import Factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();//factory method

    Menu creatMenu();//factory method
}
