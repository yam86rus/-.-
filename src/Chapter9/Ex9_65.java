package Chapter9;

//9.65. Дано предложение. Определить:
//        а) число вхождений в него буквосочетания ро;
//        б) число вхождений в него некоторого буквосочетания из двух букв;
//        в) число вхождений в него некоторого буквосочетания.
public class Ex9_65 {
    static int count(String text, String s2) {
        return (text.length() - text.replace(s2, "").length()) / s2.length();
    }

    public static void main(String[] args) {
        String s1 = "Слово. Слово. Сло";
        String s2 = "Слово.";
        System.out.println(count(s1, s2));
    }
}

