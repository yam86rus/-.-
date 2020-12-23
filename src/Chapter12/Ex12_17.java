package Chapter12;

import java.util.Arrays;

//12.17. Определить:
//        а) какой элемент двумерного массива меньше: расположенный в правом нижнем или в левом нижнем углу;
//        б) какой элемент двумерного массива меньше: расположенный в правом верхнем или в левом нижнем углу.
public class Ex12_17 {
    static void foo1(int[][] a) {
        int n1 = a[a.length - 1][a[a.length - 1].length - 1];
        int n2 = a[a.length - 1][0];
        System.out.println("правый нижний " + n1);
        System.out.println("левый нижний " + n2);
        System.out.println("элемент меньший из этих двух: " + Math.min(n1, n2));
    }

    static void foo2(int[][] a) {
        int n1 = a[0][a[0].length - 1];
        int n2 = a[a.length - 1][0];
        System.out.println("правый верхний " + n1);
        System.out.println("левый нижний " + n2);
        System.out.println("элемент меньший из этих двух: " + Math.min(n1, n2));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr));
        foo1(arr);
        foo2(arr);
    }
}
