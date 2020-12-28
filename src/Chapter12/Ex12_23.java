package Chapter12;

import java.util.Arrays;

//12.23. Заполнить двумерный массив размером 7 7 так, как показано на рис. 12.1.
public class Ex12_23 {
    static int[][] fill1(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][6 - i] = 1;
        }
        return a;
    }

    static int[][] fill2(int[][] a) {
        fill1(a);
        a[2][3] = 1;
        a[4][3] = 1;
        a[3][2] = 1;
        a[3][4] = 1;
        return a;
    }

    static int[][] fill3(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length - i; j++) {
                a[i][j] = 1;
            }
        }

        for (int i = a.length - 1; i >= a.length / 2 + 1; i--) {
            for (int j = a.length-i-1; j < i+1; j++) {
                a[i][j] = 1;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] ar1 = new int[7][7];
        int[][] ar2 = new int[7][7];
        int[][] ar3 = new int[7][7];

        fill1(ar1);
        for (int[] n : ar1) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("----------");
        fill2(ar2);
        for (int[] n : ar2) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("----------");
        fill3(ar3);
        for (int[] n : ar3) {
            System.out.println(Arrays.toString(n));
        }
    }
}
