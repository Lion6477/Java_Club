package Homework_3;

import java.util.Arrays;

public class Zad_2 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int[] values_new = new int[values.length];
        for (int i = values.length - 1; i >= 0; i--) {
            if (i + 1 >= values.length) {
                values_new[i + 1 - values.length] = values[i];
            } else {
                values_new[i + 1] = values[i];
            }
        }
        System.out.println("Old array: " + Arrays.toString(values));
        System.out.println("New array: " + Arrays.toString(values_new));
    }
}

