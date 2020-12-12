package Chapter9;

//9.94. Дано предложение. Заменить в нем все вхождения буквосочетания ах на ух.
public class Ex9_94 {
    public static void main(String[] args) {
        String s = "Дано предложение.ах ахах Заменить в нем все вхождения буквосочетания ах на ух";
        System.out.println(s);
        String s1 = s.replace("ах", "ух");
        System.out.println(s1);
    }
}
