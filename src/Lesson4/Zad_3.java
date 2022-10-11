package Lesson4;

import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type number: ");
        int a = scan.nextInt();

        for (int i = 2; i < a; ) {
            if (a % i == 0) {
                System.out.println("The number is not simple");
                break;
            }
            System.out.println("The number is simple");
            break;
        }
    }

}
