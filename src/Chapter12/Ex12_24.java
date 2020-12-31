package Chapter12;

import java.util.Arrays;

//12.24. Заполнить массив размером 6 6 так, как показано на рис. 12.2.
public class Ex12_24 {
    static void showInfo(int[][] a) {
        for (int[] n : a) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }
        showInfo(arr);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
// TODO доделать.
            }
        }
        showInfo(arr);
    }
}
