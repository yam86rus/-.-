package Chapter11;

import java.util.Arrays;

//11.71. В массиве записаны оценки ученика по 10 предметам. Определить общее количество четверок и пятерок.
public class Ex11_71 {
    public static void main(String[] args) {


        int[] a = {4, 3, 2, 3, 4, 5, 4, 3, 2, 3, 4};
        int n1 = 0, n2 = 0;
        for (int n : a) {
            if (n==4) n1++;
            if (n==5) n2++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Четверок " + n1);
        System.out.println("пятерок " + n2);
    }
}
