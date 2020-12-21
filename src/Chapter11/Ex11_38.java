package Chapter11;

//11.38. Дан массив натуральных чисел. Напечатать:
//        а) все элементы массива, являющиеся двузначными числами;
//        б) все элементы массива, являющиеся трехзначными числами.
public class Ex11_38 {
    static int check(int n) {
        int result = 0;
        while (n > 0) {
            result++;
            n /= 10;
        }
        return result;
    }

    static void foo(int[] a, int p) {
        for (int i = 0; i < a.length; i++) {
            if (check(a[i]) == p) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15, 123, 124, 125, 125};
        foo(arr1,2);
        foo(arr1,3);
        foo(arr1,1);

    }
}
