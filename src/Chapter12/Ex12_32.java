package Chapter12;

import java.util.Arrays;

//12.32. Дан двумерный массив. Вывести на экран:
//        а) все элементы третьей строки массива, начиная с последнего элемента этой
//        строки;
//        б) все элементы k-го столбца массива, начиная с нижнего элемента этого
//        столбца.
public class Ex12_32 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i + j;
            }
        }
        for (Integer[] i : array) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("////////");
        for (int i = array[2].length-1; i >= 0; i--) {
            System.out.print(array[2][i] + " ");
        }

    }
}
