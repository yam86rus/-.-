package Chapter12;

//12.2. Дан двумерный массив.
//        а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
//        б) Вывести на экран элемент, расположенный в левом верхнем углу массива.
public class Ex12_2 {
    public static void main(String[] args) {
        int[][] array = {{4, -2}, {9, -3, 2, 6, 7}, {0, 0, 2, 7}, {1, 15}};
        int bottomRight = array[array.length - 1][array[array.length - 1].length - 1];
        System.out.println(bottomRight);
        int topLeft = array[0][0];
        System.out.println(topLeft);
    }

}
