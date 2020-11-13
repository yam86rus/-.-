package Chapter9;

//9.55. Дано предложение. Составить программу, которая выводит все вхождения
// в предложение двух заданных символов.
public class Ex9_55 {
    static StringBuilder showInfo(String s, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == c1 || s.charAt(i) == c2) {
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String s = "Дано предложение";
        System.out.println(showInfo(s, 'о', 'ж'));
    }
}
