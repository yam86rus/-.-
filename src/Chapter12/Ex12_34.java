package Chapter12;

import java.util.Arrays;

//12.34. Дан двумерный массив. Вывести на экран его элементы следующим образом:
//        а) сначала элементы первой строки справа налево, затем второй строки спра-ва налево и т. п.;
//        б) сначала элементы первой строки справа налево, затем второй строки слева направо и т. п.;
//        в) сначала элементы первого столбца сверху вниз, затем второго столбца сверху вниз и т. п.;
//        г) сначала элементы первого столбца снизу вверх, затем второго столбца снизу вверх и т. п.
public class Ex12_34 {
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

        System.out.println("//////");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(doubleArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
