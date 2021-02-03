package Chapter12;

import java.util.Arrays;

//12.27. Дан двумерный массив из m строк и n столбцов. Заполнить его значениями
//        элементов одномерного массива размером m n. Заполнение проводить по
//        строкам, начиная с первой (а в ней — начиная с первого элемента).
public class Ex12_26 {
    public static void main(String[] args) {
        int[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int newArrayLength = doubleArray.length * doubleArray[0].length;
        int[] newArray = new int[newArrayLength];

        for (int[] ar : doubleArray) {
            for (int n : ar) {

            }
        }

        int cointer = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[0].length; j++) {
                newArray[cointer++] = doubleArray[i][j];
            }
        }
        System.out.println(Arrays.toString(newArray));


    }
}
