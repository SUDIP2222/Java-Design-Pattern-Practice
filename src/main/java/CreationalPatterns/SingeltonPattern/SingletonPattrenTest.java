package CreationalPatterns.SingeltonPattern;

public class SingletonPattrenTest {
    public static void main(String args[]) {
        ClassSingleton classSingleton = ClassSingleton.getInstance();

        System.out.println(classSingleton.getInfo());

        classSingleton.setInfo("Set Info");

        System.out.println(classSingleton.getInfo());
    }
}
