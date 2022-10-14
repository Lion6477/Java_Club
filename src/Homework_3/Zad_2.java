package Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        System.out.println(Arrays.toString(values));
        boolean bool = true;
        while (bool){
            int temp = 0;
//            for (int i = 0; i < values.length; i++) {
//                if (i+1 < values.length){
//                    temp = values[i+1];
//                    values[i+1] = values[i];
//                    values[i] = temp;
//                }else {
//                    temp = values[i];
//                    values[0] = temp;
//                    temp = 0;
//                }
//                System.out.println(Arrays.toString(values));
//            }
            temp = values[0];
            for (int i = values.length; i; i--) {
                if (i == values.length - 1){
                    values[i] = temp;
                }else {
                    values[i+1] = values[i];
                }
                System.out.println(Arrays.toString(values));
            }
            bool = scanner.nextBoolean();

        }


    }
}
