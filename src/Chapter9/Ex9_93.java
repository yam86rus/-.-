package Chapter9;
//9.93. Дано предложение. Все его символы, стоящие на третьем, шестом, девятом и
//        т. д. местах, заменить буквой а.

public class Ex9_93 {
    public static void main(String[] args) {
        String s = "Дано предложение. Все его символы, стоящие на третьем, шестом, девятом";
        System.out.println(s);
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 2; i <= s.length() - 1; i += 3) {
            s1.replace(i, i + 1, "а");
        }
        String string = s1.toString();
        System.out.println(string);
    }
}
