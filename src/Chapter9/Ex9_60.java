package Chapter9;

//9.60. Дано предложение. Определить число пробелов в нем.
public class Ex9_60 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
