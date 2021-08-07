package firstTry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Izvēlieties figūru: \n\tKvadrāts\n\tTainstūris\n\tRiņķis");
        String figur = sc.nextLine().toLowerCase();

        double side1 = 0;
        double side2 = 0;
        double radius = 0;

        if (figur.equals("kvadrāts") || figur.equals("tainstūris")) {
            System.out.println("ievadiet malas A garumu:");
            side1 = sc.nextDouble();
            System.out.println("ievadiet malas B garumu:");
            side2 = sc.nextDouble();
            Calculations fig = new Calculations(figur, side1, side2);
        } else if (figur.equals("riņķis")) {
            System.out.println("ievadiet Riņķa rādiusu: ");
            radius = sc.nextDouble();
            Calculations fig2 = new Calculations(figur, radius);
        } else {
            System.out.println("Šāda figūra nav pieejama");
        }


    }
}
