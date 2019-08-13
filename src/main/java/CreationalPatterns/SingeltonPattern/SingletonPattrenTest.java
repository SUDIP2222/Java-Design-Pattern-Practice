package CreationalPatterns.SingeltonPattern;

//Singleton restricts object creation for a class to only one instance.

public class SingletonPattrenTest {
    public static void main(String args[]) {
        ClassSingleton classSingleton = ClassSingleton.getInstance();

        System.out.println(classSingleton.getInfo());

        classSingleton.setInfo("Set Info");

        System.out.println(classSingleton.getInfo());
    }
}
