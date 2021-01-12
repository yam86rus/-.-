package Chapter9;

import java.util.ArrayList;
import java.util.List;

//9.175. Дано предложение. Напечатать все слова, которые встречаются в нем по од-ному разу.
public class Ex9_175 {
    static void foo(String str) {
        str = str.replace(",","");
        String[] arr = str.split(" ");

        List<String> list = new ArrayList<>();
        for (String string : arr) {
            if (!list.contains(string)) {
                list.add(string);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        String s = "Напечатать все все слова, которые встречаются в нем и только в нем по од-ному разу";
        foo(s);
    }
}
