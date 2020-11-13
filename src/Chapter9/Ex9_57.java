package Chapter9;

//9.57. Дано предложение. Вывести "столбиком" все его буквы и, стоящие на четных местах.
public class Ex9_57 {
    public static void main(String[] args) {
        String s = "Тина предложение";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i % 2 != 0 && s.charAt(i) == 'и') {
                System.out.println(s.charAt(i));
            }
        }
    }
}
