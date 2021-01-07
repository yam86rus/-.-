package Chapter11;

//11.54. Дан массив. Найти:
//        а) сумму элементов массива, значение которых не превышает 20;
//        б) сумму элементов массива, больших числа a.
public class Ex11_54 {
    static void foo(int[] array) {
        int result = 0;
        for (int n : array) {
            if (n + result < 20) {
                result += n;
            }
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        int[] ar = {1, 5, 3, 5, 5, 6};
        foo(ar);
    }
}
