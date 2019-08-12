package CreationalPatterns.FactoryPattern;

public class FactoryPatternTest {
    public static void main(String args[]) {
        PolygonFactory polygonFactory = new PolygonFactory();

        Polygon triangle = polygonFactory.getPolygon(1);
        System.out.println(triangle.getType());

        Polygon square = polygonFactory.getPolygon(2);
        System.out.println(square.getType());
    }
}
