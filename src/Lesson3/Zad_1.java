package Lesson3;

import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        System.out.println(Checking());
    }

    private static String Checking() {
        double a;
        String result;

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();

        if (a % 10 == 3) {
            result = "The last digit of the entered number IS three.";
            return result;

        } else {
            result = "The last digit of the entered number DOES NOT equal three.";
            return result;

        }
    }
}