package CreationalPatterns.AbstractFactoryPattern;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Object create(String animalType) {
        if("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}
