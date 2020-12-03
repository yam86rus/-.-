package Chapter12;

//12.5. Дан двумерный массив. Вывести на экран:
//        а) все элементы пятой строки массива;
//        б) все элементы s-го столбца массива.
public class Ex12_5 {
    public static void main(String[] args) {
        int[][] array = {{4, -2, 3, 4, 11}, {9, -3, 2, 6, 7}, {0, 0, 2, 7, 3}, {1, 15, 3, 55, 6}, {8, 3, 24, 17, 3}};
        int a = array[4].length - 1;
        for (int i = 0; i <= a; i++) {
            System.out.print(array[4][i] + " ");
        }
        System.out.println();
        System.out.println("-----");
        int b = array.length - 1;
        for (int i = 0; i <= b; i++) {
            System.out.println(array[i][4]);
        }
    }
}
