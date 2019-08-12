package CreationalPatterns.AbstractFactoryPattern;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if("toy".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
