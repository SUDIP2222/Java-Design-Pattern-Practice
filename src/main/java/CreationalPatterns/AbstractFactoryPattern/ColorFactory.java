package CreationalPatterns.AbstractFactoryPattern;

public class ColorFactory implements AbstractFactory {
    @Override
    public Object create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else if("White".equalsIgnoreCase(colorType)) {
            return new White();
        }
        return null;
    }
}
