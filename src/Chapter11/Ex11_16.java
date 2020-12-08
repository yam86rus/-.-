package Chapter11;

//11.16. Дан массив целых чисел. Выяснить:
//        а) является ли s-й элемент массива положительным числом;
//        б) является ли k-й элемент массива четным числом;
//        в) какой элемент массива больше: k-й или s-й.
public class Ex11_16 {
    public static void foo1(int[] ar, int a) {
        String result = (ar[a] >= 0) ? "положительное" : "отрицательное";
        System.out.println(result);
    }

    public static int showInfo(int[] ar, int k, int s) {
        return (ar[k] > ar[s]) ? ar[k] : ar[s];
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 8, -4, 32, 58, 22};
        foo1(array, 2);
        foo1(array, 3);
        System.out.println(Math.max(array[0], array[1]));
        System.out.println(showInfo(array,2,1));
    }
}
