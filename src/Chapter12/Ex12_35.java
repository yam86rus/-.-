package Chapter12;

import java.util.Arrays;

//12.35. Дан двумерный массив. Определить:
//        а) сумму всех элементов третьей строки массива;
//        б) сумму всех элементов s-го столбца массива.
public class Ex12_35 {
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
        System.out.println("////");
        int result = Arrays.stream(doubleArray[2]).sum();
        System.out.println(result);
        System.out.println("////");
        int result2 = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            result2 += doubleArray[i][2];
        }
        System.out.println(result2);
    }
}
