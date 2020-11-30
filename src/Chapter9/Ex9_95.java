package Chapter9;

import java.util.ArrayList;

//9.95. Дано предложение. Заменить в нем все вхождения буквосочетания да на не.
public class Ex9_95 {
    public static void main(String[] args) {
        String s = "Дано предложение. Заменить в нем все вхождения буквосочетания да на нет.";
        System.out.println(s);
        System.out.println(s.replace("да", "нет"));
    }
}
