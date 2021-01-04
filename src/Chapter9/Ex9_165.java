package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//9.165. Дано предложение. Напечатать его в обратном порядке слов, например, предложение
//        мама мыла раму должно быть напечатано в виде раму мыла мама.

public class Ex9_165 {
    public static void main(String[] args) {
        String s = "мама мыла раму";
        String[] ar = s.split(" ");
        List<String> list = Arrays.asList(ar);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
