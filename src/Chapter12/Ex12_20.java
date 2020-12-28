package Chapter12;

//12.20. Дан двумерный массив целых чисел. Выяснить:
//        а) имеются ли четные числа в левом верхнем или в левом нижнем углу;
//        б) имеются ли числа, оканчивающиеся нулем, в правом верхнем или в правом нижнем углу.
public class Ex12_20 {
    static boolean foo1(int[][] a1) {
        return (a1[0][0] % 2 == 0 || a1[a1.length - 1][0] % 2 == 0) ? true : false;
    }

    static boolean foo2(int[][] a2) {
        return (a2[0][a2[0].length - 1] % 10 == 0 || a2[a2.length - 1][a2[a2.length - 1].length-1] % 10 == 0) ? true : false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 40}, {4, 6, 7, 1}};
        System.out.println(foo1(a));
        System.out.println(foo2(a));
    }
}
