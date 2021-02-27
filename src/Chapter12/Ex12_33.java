package Chapter12;

import java.util.Arrays;

//12.33. Дан двумерный массив. Вывести на экран:
//        а) все элементы пятого столбца массива, начиная с последнего элемента это-
//        го столбца;
//        б) все элементы n-й строки массива, начиная с нижнего элемента этой
//        строки.
public class Ex12_33 {
    public static int randomNumber() {
        int down = 0;
        int up = 10;
        int result = down + (int) ((up - down + 1) * Math.random());
        return result;
    }

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                doubleArray[i][j] = randomNumber();
            }
        }
        for (int[] i : doubleArray) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("//////////////");
        for (int i = 4; i >= 0; i--) {
            System.out.print(doubleArray[i][4]+" ");
        }
    }

}
