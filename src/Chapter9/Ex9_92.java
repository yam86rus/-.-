package Chapter9;

//9.92. Дано предложение. Все его символы, стоящие на четных местах, заменить буквой ы.
public class Ex9_92 {
    public static void main(String[] args) {
        String s = "Дано предложение. Все его символы, стоящие на четных местах, заменить буквой ы.";
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 1; i < s.length() - 1; i += 2) {
            stringBuilder.replace(i, i+1, "ы");
        }
        System.out.println(stringBuilder);
    }
}
