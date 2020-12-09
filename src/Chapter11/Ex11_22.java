package Chapter11;

import java.util.Arrays;

//11.22. В массиве хранятся сведения о стоимости 12 различных предметов. Опре-
//        делить общую стоимость всех предметов.
public class Ex11_22 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.stream(a).sum());
    }
}
