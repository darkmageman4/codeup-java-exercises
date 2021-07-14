package util;

import java.util.Scanner;

public class Input {

    //fields
    private Scanner scanner;
    private int number;
    private double dbl;

    //constructors
    public Input(Scanner scanner, int number, double dbl) {
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.dbl = dbl;
    }

    //
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {
        System.out.println("Enter a integer");
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int Num;
        do {
            System.out.printf("enter a integer between %d and %d%n", min, max);
            Num = scanner.nextInt();
        } while (Num < min || Num > max);
        return Num;
    }

    public String getString() {
        return "Codeup";
    }

    public boolean isYesNo() {
        System.out.println("Hello");
        String yankeeDoodle = scanner.nextLine();
        return !yankeeDoodle.equalsIgnoreCase("n");
    }

    public double getDbl(double min, double max) {
        this.dbl = getDbl();

        if (dbl < min) {
            System.out.println("Pick a number between " + min + " and " + max);
            getDbl(min, max);
        } else if (dbl > max) {
            System.out.println("Pick a number between " + min + " and " + max);
            getDbl(min, max);
        }
        return this.dbl;
    }

    public double getDbl() {
        double dbl = scanner.nextDouble();
        return dbl;
    }
}
