package Factory;

public class Flutter {
    //Factory: Anything that allows us to create the object of corresponding types
    //Abstract Factory: when we have lot of factory methods, we move all the methods to a new interface.
    //non factory methods

    void refreshUI() {
        System.out.println("Refreshing UI");
    }
    //non factory methods
    void setTheme() {
        System.out.println("Setting Theme");
    }

    //factory method
    public UIFactory getUIFactory(SupportedPlatforms platform){
        //         if (platform.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        } else if (platform.equals(SupportedPlatforms.WINDOWS)) {
//            return new WindowsUIFactory();
//        } else if (platform.equals(SupportedPlatforms.IOS)) {
//            return new IOSUIFactory();
//        }
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}
