package Chapter9;
//9.96. Дано предложение. Заменить в нем все вхождения буквосочетания про на нет.
public class Ex9_96 {
    public static void main(String[] args) {
        String s ="Дано предложение. Заменить в нем все вхождения буквосочетания про на нет.";
        System.out.println(s);
        System.out.println(s.replace("про","нет"));
    }
}
