package Chapter12;

import java.util.Scanner;

//12.10. Составить программу, которая меняет местами два любых элемента двумер-ного массива.
public class Ex12_10 {
    public static void showArray(int[][] array) {
        for (int[] ar : array) {
            for (int n : ar) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a1 = 0, a2 = 1;
        int b1 = 3, b2 = 2;

        int[][] array = {{1, 3, 5}, {2, 4, 6}, {4, 7}, {22, 33, 44, 55}};
        int c = array[a1][a2];
        showArray(array);
        array[a1][a2] = array[b1][b2];
        array[b1][b2] = c;
        showArray(array);

    }
}
