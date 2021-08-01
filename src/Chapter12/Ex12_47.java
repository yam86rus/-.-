package Chapter12;
//12.47. Дан двумерный массив. Определить произведение элементов третьей строки.

import java.util.Arrays;

public class Ex12_47 {
    public static void main(String[] args) {
        FillDoubleArray da = new FillDoubleArray();
        int[][] doubleArray = da.fillDoubleArray(new int[5][5], 1, 10);
        for (int[] line : doubleArray) {
            System.out.println(Arrays.toString(line));
        }

        int result = doubleArray[2][0];
        for (int i = 1; i < doubleArray[2].length; i++) {
            result *= doubleArray[2][i];
        }
        System.out.println("--------");
        System.out.println(result);
        System.out.println("--------");

    }
}
