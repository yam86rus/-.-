package Chapter11;

//11.15. Дан массив. Составить программу:
//        а) расчета квадратного корня из любого элемента массива;
//        б) расчета среднего арифметического двух любых элементов массива.
public class Ex11_15 {
    private static double sqr(int[] ar, int n) {
        return Math.sqrt(ar[n - 1]);
    }

    private static double avr(int[] arr, int a, int b) {
        return (arr[a - 1] + arr[b - 1]) / 2;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 32, 14, 8};
        System.out.println("корень квардратный числа " + sqr(array, 3));
        System.out.println("Среднее арифметическое двух чисел " + avr(array, 2, 3));
    }
}
