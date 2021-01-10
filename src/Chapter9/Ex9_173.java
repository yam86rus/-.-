package Chapter9;

import java.util.Arrays;

//9.173. Дано предложение. Верно ли, что его самое длинное слово имеет больше 10 символов?
public class Ex9_173 {
    static boolean checkLength(String str) {
        boolean result = false;
        String[] ar = str.split(" ");
        int[] ar2 = Arrays.stream(ar).mapToInt(e -> e.length()).toArray();
        Arrays.sort(ar2);
        result = (ar2[ar.length - 1] > 10) ? true : false;
        return result;
    }

    public static void main(String[] args) {
        String s = "Верно ли, что его самое длинное слово имеет больше 10 символов?";
        System.out.println(checkLength(s));
    }
}
