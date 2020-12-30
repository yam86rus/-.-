package Chapter11;

//11.45. Дан массив. Вывести на экран сначала его элементы, стоящие на четных местах, затем — на нечетных.
public class Ex11_45 {
    static void foo(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        foo(a);
    }
}
