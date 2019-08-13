package CreationalPatterns.AbstractFactoryPattern;

//Abstract factory groups object factories that have a common theme.

public class AbstractFactoryTest {
    public static void main(String args[]) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("toy");
        Animal animal = (Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("white");

        System.out.println("A " + animal.getAnimal() + " with " + color.getColor() + " color " + animal.makeSound());
    }
}
