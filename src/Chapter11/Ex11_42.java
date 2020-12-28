package Chapter11;

//11.42. Дан массив целых чисел. Найти номера элементов, оканчивающихся циф-рой 0
//        (известно, что такие элементы в массиве есть).
public class Ex11_42 {
    static void foo1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 20, 3, 40, 50, 606};
        foo1(a);
    }
}
