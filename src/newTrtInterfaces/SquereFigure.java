package newTrtInterfaces;

public class SquereFigure implements Metods {
    String name;
    double side1;
    double side2;

    public SquereFigure(String name, double side1, double side2) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void figureArea() {
        double result = side1 * side2;
        String substring = name.substring(0, name.length() - 1);
        String replaced = substring + "a";
        System.out.println(replaced + " laukums ir " + String.format("%.2f", result));
    }

    @Override
    public void figurePerimeter() {
        double result = 2 * (side1 + side2);
        String substring = name.substring(0, name.length() - 1);
        String replaced = substring + "a";
        System.out.println(replaced + " perimetrs ir " + String.format("%.2f", result));
    }
}
