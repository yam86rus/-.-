package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//9.147. Дан текст, имеющий вид: "d1+-d2 ... dn " , где di — цифры (n > 1). Вычис-
//        лить записанную в тексте алгебраическую сумму.
public class Ex9_147 {
    static int summ(String s) {
        int result = 0;
        String str = s.replaceAll("d", "");
        str = str.replaceAll("\\+", "@+");
        str = str.replaceAll("\\-", "@-");
        String[] array = str.split("@");
        System.out.println(Arrays.toString(array));
        int[] ar1 = new int[array.length];
        for (int i = 0; i <= ar1.length - 1; i++) {
            ar1[i] = Integer.parseInt(array[i]);
        }
        System.out.println("Массив чисел");
        System.out.println(Arrays.toString(ar1));
        result = Arrays.stream(ar1).sum();
        return result;
    }
    // 2+4-6+8-10
    // 2@+4@-6@+8@-10

    public static void main(String[] args) {
        String s = "d2+d4-d6+d8-d10";
        System.out.println(summ(s));
    }

}
