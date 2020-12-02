package Chapter9;

//9.115. Дано предложение. Удалить из него все буквы о, стоящие на нечетных местах.
public class Ex9_115 {
    public static void main(String[] args) {
        String s = "Кровопролитный";
        StringBuilder sb = new StringBuilder();
        System.out.println(s);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'о' && i % 2 == 0) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);
    }
}
