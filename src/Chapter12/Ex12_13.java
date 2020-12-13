package Chapter12;

//12.13. Дан двумерный массив. Составить программу:
//        а) расчета суммы двух любых элементов третьего столбца массива;
//        б) расчета произведения двух любых элементов второй строки массива.
public class Ex12_13 {
    static int foo1(int[][] array) {
        int down = 0;
        int up = array.length-1;
        int randomNumber = down + (int) ((up - down + 1) * Math.random());
        int result = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            result += array[i][array[i].length - 1];
//            System.out.println(result);
        }
//        System.out.println("случайное число " + randomNumber);
//        System.out.println(array[randomNumber][array[randomNumber].length-1]);
        return result - (array[randomNumber][array[randomNumber].length-1]);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println(foo1(array));
    }
}
