package Chapter9;

import java.util.Arrays;

//9.177. Дано предложение. В нем только два слова одинаковые. Найти эти слова.
public class Ex9_177 {
    static void foo(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String s1 = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i - 1]) && !arr[i].equals(arr[i + 1])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "В нем только два слова одинаковые. найти найти эти слова";
        foo(s);
    }
}
