package CreationalPatterns.FactoryPattern;

public class PolygonFactory {

    public Polygon getPolygon(int number) {
        if(number == 1) {
            return new Triangle();
        }
        else if(number == 2) {
            return new Square();
        }
        else if (number == 3) {
            return new Pentagon();
        }
        return null;
    }
}
