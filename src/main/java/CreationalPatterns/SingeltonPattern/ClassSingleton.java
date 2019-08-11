package CreationalPatterns.SingeltonPattern;

public class ClassSingleton {

    private static ClassSingleton classSingleton;

    private String info = "Class Info";

    private ClassSingleton() {

    }

    public static ClassSingleton getInstance() {
        if (classSingleton == null) {
            classSingleton = new ClassSingleton();
        }
        return classSingleton;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
