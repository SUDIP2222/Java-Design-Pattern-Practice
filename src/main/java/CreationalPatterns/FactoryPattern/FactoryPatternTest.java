package CreationalPatterns.FactoryPattern;

import java.util.Objects;

//Factory method creates objects without specifying the exact class to create.

public class FactoryPatternTest {
    public static void main(String args[]) {
        PolygonFactory polygonFactory = new PolygonFactory();

        Polygon triangle = polygonFactory.getPolygon(1);
        if(!Objects.isNull(triangle)) {
            System.out.println(triangle.getType());
        }

        Polygon square = polygonFactory.getPolygon(2);
        if(!Objects.isNull(square)) {
            System.out.println(square.getType());
        }
    }
}
