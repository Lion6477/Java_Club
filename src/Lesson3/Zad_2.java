package Lesson3;

import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        String result = hryvnia();
        System.out.println(result);
    }

    private static String hryvnia() {
        System.out.println("Enter the amount of money (No more than 10):");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ;
        String result;

        if (num < 0) {
            result = "Enter a number no less than 0!.";
            return result;

        } else if (num > 10) {
            result = "Enter a number no more than 10!.";
            return result;

        } else if (num == 1) {
            result = "Correct spelling: " + num + " hryvnya.";
            return result;

        } else if (num >= 1 && num <= 4) {
            result = "Correct spelling: " + num + " hryvni.";
            return result;

        } else {
            result = "Correct spelling: " + num + " hryven.";
            return result;

        }
    }
}