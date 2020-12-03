package Chapter12;

//12.1. Дан двумерный массив.
//        а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
//        б) Вывести на экран элемент, расположенный в левом нижнем углу массива.
public class Ex12_1 {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 5, 6, 88}, {-5, 2, 14}, {12, 6, -8, 4}};
        int topRight = array[0][array[0].length - 1];
        int bottomLeft = array[array.length - 1][0];
        System.out.println(topRight);
        System.out.println(bottomLeft);
    }
}
