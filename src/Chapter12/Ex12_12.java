package Chapter12;

//12.12. Дан двумерный массив. Найти:
//        а) сумму элементов, расположенных в правом верхнем и левом нижнем углах;
//        б) среднее геометрическое элементов, расположенных в четырех углах.
public class Ex12_12 {
    static double foo1(int[][] array) {
        double n1 = array[0][0];
        double n2 = array[0][array[0].length - 1];
        double n3 = array[array.length - 1][0];
        double n4 = array[array.length - 1][array[array.length - 1].length - 1];
        double result = Math.exp(Math.log(n1 * n2 * n3 * n4) / 4);
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {2, 4, 6}, {4, 7}, {22, 33, 44, 5, 2}};
        int a = array[0][array[0].length - 1];
        int b = array[array.length - 1][0];
        System.out.println(a + b);
        System.out.println(foo1(array));

    }
}
