package Lesson3;

import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {
        System.out.println(equation());
    }

    private static String equation() {
        double a, b, c, Discriminant;
        String result;
        System.out.println("Only the equation of the species:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a, b and c:");

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        Discriminant = b * b - 4 * a * c;

        if (Discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            result = "Root equations: x_1 = " + x1 + ", x_2 = " + x2 + ".";
            return result;

        } else if (Discriminant == 0) {
            double x;
            x = -b / (2 * a);

            result = "Root equation: x = " + x + ".";
            return result;

        } else {
            result = "The equation has no integer roots!";
            return result;

        }
    }
}