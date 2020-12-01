package Chapter9;

import java.util.Set;

//Дано слово. Удалить из него все повторяющиеся буквы, оставив их первые вхождения,
//        т. е. в слове должны остаться только различные буквы.
public class Ex9_114 {
    public static void main(String[] args) {
        String s = "авиаконструктор";
        System.out.println(s);
        String s1 ="" ;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!s1.contains(""+s.charAt(i))){
                s1 +=s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
