package firstTry;

public class Calculations extends Figure {


    public Calculations(String figure, double radius) {
       // super(figure, radius);
        circlePerimeter(radius);
        circleSquare(radius);
    }

    private void circleSquare(double radius) {
        double result = Math.PI * (radius * radius);
        System.out.println("Riņķa laukums ir " + String.format("%.2f", result));
    }

    private void circlePerimeter(double radius) {
        double result = 2 * Math.PI * radius;
        System.out.println("Riņķa perimetrs ir " + String.format("%.2f", result));
    }


    public Calculations(String figure, double side1, double side2) {
        //super(figure, side1, side2);
        fourSidePerimeter(figure, side1, side2);
        fourSideSquare(figure, side1, side2);
    }

    private void fourSideSquare(String figure, double side1, double side2) {
        double result = side1 * side2;
        String substring = figure.substring(0, figure.length() - 1);
        String replaced = substring + "a";
        System.out.println(replaced + " laukums ir " + String.format("%.2f", result));
    }

    private void fourSidePerimeter(String figure, double side1, double side2) {
        double result = 2 * (side1 + side2);
        String substring = figure.substring(0, figure.length() - 1);
        String replaced = substring + "a";
        System.out.println(replaced + " perimetrs ir " + String.format("%.2f", result));

    }

}
