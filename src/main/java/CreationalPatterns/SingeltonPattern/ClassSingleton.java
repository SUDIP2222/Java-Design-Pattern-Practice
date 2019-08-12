package CreationalPatterns.SingeltonPattern;

import java.util.Objects;

public class ClassSingleton {

    private static ClassSingleton classSingleton;

    private String info = "Class Info";

    private ClassSingleton() {

    }

    public static ClassSingleton getInstance() {
        if (Objects.isNull(classSingleton)) {
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
