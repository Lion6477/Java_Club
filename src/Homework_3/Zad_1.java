package Homework_3;

public class Zad_1 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int sum = 0, max_index = 0, min_index = 0, max_value = 0, min_value = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] >= max_value){
                max_value = values[i];
                max_index = i;
            }
            if (values[i] <= min_value){
                min_value = values[i];
                min_index = i;
            }
        }
        for (int i = min_index+1; i < max_index; i++) {
            sum += values[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("max_index = " + max_index);
        System.out.println("min_index = " + min_index);
    }
}
