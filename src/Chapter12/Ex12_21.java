package Chapter12;

//12.21. Дан двумерный массив целых чисел. Выяснить:
//        а) имеются ли нечетные числа в правом верхнем или в правом нижнем углу;
//        б) имеются ли числа, оканчивающиеся цифрой 5, в левом верхнем или в ле-вом нижнем углу.
public class Ex12_21 {
    static boolean foo(int[][] a1) {
        return (a1[0][a1[0].length - 1] % 2 != 0 || a1[a1.length - 1][a1[a1.length - 1].length - 1] % 2 != 0) ? true : false;
    }

    static boolean foo1(int[][] a2) {
        return (a2[0][0] == 5 || a2[a2.length - 1][0] == 5) ? true : false;
    }

    public static void main(String[] args) {
        int[][] b = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(foo(b));
        System.out.println(foo1(b));
    }
}
