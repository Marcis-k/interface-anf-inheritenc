package newTrtInterfaces;

public class RoundFigure implements Metods {
    double radius;

    public RoundFigure(double radius) {
        this.radius = radius;
    }

    @Override
    public void figureArea() {
        double result = Math.PI * (radius * radius);
        System.out.println("Riņķa laukums ir " + String.format("%.2f", result));
    }

    @Override
    public void figurePerimeter() {
        double result = 2 * Math.PI * radius;
        System.out.println("Riņķa perimetrs ir " + String.format("%.2f", result));
    }
}
