package Chapter12;

//12.19. Составить программу:
//        а) сравнения по абсолютной величине элемента, расположенного в верхнем правом углу двумерного массива,
//        с любым другим элементом массива (оп-ределить, какая из абсолютных величин больше);
//        б) сравнения двух любых элементов массива (определить, какой из них меньше).
public class Ex12_19 {
    static int foo1(int[][] a, int i, int i1) {
        return Math.max(a[0][a[0].length - 1], a[i][i1]);
    }

    static int foo2(int[][] a, int i, int i1, int i2, int i3) {
        return Math.min(a[i][i1], a[i2][i3]);
    }

    public static void main(String[] args) {
        int[][] da = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(foo1(da, 1, 1));
        System.out.println(foo2(da, 0, 2, 1, 1));
    }
}
