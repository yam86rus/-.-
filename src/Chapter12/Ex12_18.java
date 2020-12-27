package Chapter12;

//12.18. Определить:
//        а) какой элемент двумерного массива больше: расположенный в левом верх-нем
//        или в правом верхнем углу;
//        б) какой элемент двумерного массива меньше: расположенный в правом нижнем
//        или в левом верхнем углу.
public class Ex12_18 {
    static void foo1(int[][] darray) {
        int n1 = darray[0][0];
        int n2 = darray[0][darray[0].length - 1];
        System.out.println(Math.max(n1, n2));
    }

    public static void main(String[] args) {
        int[][] da = {{7, 2, 3, 6}, {4, 5, 6}, {7, 8, 9}};
        foo1(da);
    }
}
