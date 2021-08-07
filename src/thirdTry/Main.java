package thirdTry;

public class Main {
    private static java.lang.Object RoundFigure;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Izvēlieties figūru: \n\tKvadrāts\n\tTainstūris\n\tRiņķis");
//        String name = sc.nextLine().toLowerCase(Locale.ROOT);
//
//        double side1 = 0;
//        double side2 = 0;
//        double radius = 0;
//
//        if (name.equals("kvadrāts") || name.equals("tainstūris")) {
//            System.out.println("ievadiet malas A garumu:");
//            side1 = sc.nextDouble();
//            System.out.println("ievadiet malas B garumu:");
//            side2 = sc.nextDouble();
//            Object squere = new SquereFigure(name, side1, side2);
//            squere.figurePerimeter();
//            squere.figureArea();
//        } else if (name.equals("riņķis")) {
//            System.out.println("ievadiet Riņķa rādiusu: ");
//            radius = sc.nextDouble();
//            RoundFigure round = new RoundFigure(radius);
//            round.figurePerimeter();
//            round.figureArea();
//        } else {
//            System.out.println("Šāda figūra nav pieejama");
//        }

        Object[] ob = {
                new RoundFigure(3),
                new RoundFigure(22),
                new SquereFigure("kvadrāts", 4, 3),
                new SquereFigure("Taisnstūris", 33, 22)
        };


        int objectCount = 0;

        for (Object s : ob) {

            s.figureArea();
            s.figurePerimeter();
            System.out.println();
            objectCount++;
        }




        System.out.println("Objekti izveidoti " + objectCount);

        System.out.println();





    }
}
