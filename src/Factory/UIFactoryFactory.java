package Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platforms){
        if(platforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platforms.equals(SupportedPlatforms.WINDOWS)){
            return new WindowsUIFactory();
        }
        else if(platforms.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
