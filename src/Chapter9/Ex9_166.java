package Chapter9;

import java.lang.reflect.Array;
import java.util.Arrays;

//9.166. Дано предложение. Поменять местами его первое и последнее слово.
public class Ex9_166 {
    public static void main(String[] args) {
        String s = "Поменять местами его первое и последнее слово";
        String[] ar = s.split(" ");
        String[] ar1 = new String[ar.length];
        ar1[0] = ar[ar.length - 1];
        ar1[ar1.length - 1] = ar[0];
        for (int i = 1; i < ar.length - 1; i++) {
            ar1[i] = ar[i];
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar1));
    }
}
