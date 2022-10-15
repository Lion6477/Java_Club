package Homework_3;

import java.util.Arrays;

public class Zad_3 {
    public static void main(String[] args) {
        int[] array0 = {1, 2, 3, 4, 5};
        int[] array1 = {5, 6, 7};
        
        int[] result = new int[array0.length + array1.length];
        int count0 = 0, count1 = 0;

        for (int i = 0; i < result.length; i++){
            if (i % 2 == 0) {
                result[i] = array0[count0];
                count0++;
                if (count0 == array0.length)
                    count0 = 0;
            } else {
                result[i] = array1[count1];
                count1++;
                if (count1 == array1.length)
                    count1 = 0;
            }
        }
        System.out.println("Result_array: " + Arrays.toString(result));
    }
}

