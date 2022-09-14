package a_introduction;

import java.util.Arrays;

public class Declarative {
    public static void main(String[] args) {

        final int[] list = {0, 1, 2, 3};
        int sum = Arrays.stream(list)
                .sum();  //declarative
        System.out.println("Suma: " + sum);

        int max = Arrays.stream(list)
                .max()              //declarative
                .orElse(-1);  //declarative
        System.out.println("Máximo: " + max);
    }
}
