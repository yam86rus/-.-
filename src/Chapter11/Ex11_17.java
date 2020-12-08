package Chapter11;

//11.17. Дан массив. Все его элементы:
//        а) увеличить в 2 раза;
//        б) уменьшить на число А;
//        в) разделить на первый элемент.
public class Ex11_17 {
    public static int[] foo1(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 8, -4, 32, 58, 22};

        for (int n : array) {
            System.out.print(n + " ");
        }

        array = foo1(array);
        System.out.println();

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
