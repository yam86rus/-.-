package Chapter9;

import java.util.Arrays;

//9.172. Дано предложение. Напечатать его самое длинное слово
//        (принять, что такое слово — единственное).
public class Ex9_172 {
    static void foo(String s) {
        String[] ar = s.split(" ");
        String result = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (result.length()<ar[i].length()){
                result = ar[i];
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "Дано предложение. Напечатать его самое длинное слово ";
        foo(s);
    }
}
