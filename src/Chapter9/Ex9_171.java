package Chapter9;

import java.util.Arrays;
import java.util.stream.IntStream;

//9.171. Дано предложение. Найти длину его самого короткого слова.
public class Ex9_171 {
    static void foo(String s) {
        String[] ar = s.split(" ");
        int[] b1 = Arrays.stream(ar).mapToInt(e -> e.length()).toArray();
        System.out.println(Arrays.toString(b1));
        Arrays.sort(b1);
        System.out.println(b1[0]);
    }

    public static void main(String[] args) {
        String s = "Дано предложение. Найти длину его самого короткого слова.";
        foo(s);
    }
}
