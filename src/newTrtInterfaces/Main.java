package newTrtInterfaces;

public class Main {
    public static void main(String[] args) {
        RoundFigure rd = new RoundFigure(33);
        rd.figureArea();
        rd.figurePerimeter();

        System.out.println();

        SquereFigure sq = new SquereFigure("kvadrāts", 12,22);
        sq.figureArea();
        sq.figurePerimeter();
    }

}
