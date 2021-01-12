package Chapter9;

import java.util.Arrays;
import java.util.Comparator;

//9.174. Дано предложение. Напечатать все его слова в порядке неубывания их длин.
public class Ex9_174 {


    static void foo(String str) {
        String[] ar = str.split(" ");
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

    }

    public static void main(String[] args) {
        String s = "Напечатать все его слова в порядке неубывания их длин.";
        String s1 = "napechatat vse ego slova v poryadke neubyvanya ih dlin";
        foo(s1);


    }
}
