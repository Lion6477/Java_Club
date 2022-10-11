package Lesson4;

import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input length array of integer:");
        int a = scan.nextInt();
        int sum = 0;

        int arrInt[] = new int[a];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i;
        }

        System.out.println("Input number unpaired natural number:");
        int n = scan.nextInt();
        if (arrInt.length < n) {
            System.out.println("Input number unpaired natural number must be smaller for length array of integer:");
            n = scan.nextInt();
        }

        int b = 0;
        int result[] = new int[n];

        for (int i = 0; b < result.length; i++) { //перебор массива
            if (arrInt[i] % 2 != 0) { // проверка элемента массива
                result[b] = i; // запись в непарные
                System.out.println(i);
                sum = sum + i;
                b += 1; // переключение на следующую ячейку для записи
            }

        }
        System.out.println("Sum is: " + sum);
    }
}