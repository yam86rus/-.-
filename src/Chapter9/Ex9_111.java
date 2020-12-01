package Chapter9;

import org.w3c.dom.ls.LSOutput;

//9.111. Дано слово. Если его длина нечетная, то удалить среднюю букву,
//        в против-ном случае — две средних буквы.
public class Ex9_111 {
    static String check(String str) {
        if (str.length() % 2 != 0) {
            return str.replaceFirst("" + str.charAt(str.length() / 2), "");
        } else {
            return str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1);
        }
    }

    public static void main(String[] args) {
        String s1 = "микрорайон"; //10 символов
        String s2 = "Агрессивный"; //11 символов
        System.out.println(s1 + " " + check(s1));
        System.out.println(s2 + " " + check(s2));
    }
}
