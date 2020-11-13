package Chapter9;

//9.53. Дано предложение. Вывести "столбиком" его третий, шестой и т. д. символы.
public class Ex9_53 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        for (int i = 2; i <= s.length() - 1; i += 3) {
            System.out.println(s.charAt(i));
        }
    }
}
