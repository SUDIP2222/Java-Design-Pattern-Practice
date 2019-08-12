package CreationalPatterns.AbstractFactoryPattern;

public interface AbstractFactory<T> {
    T create(String type);
}
