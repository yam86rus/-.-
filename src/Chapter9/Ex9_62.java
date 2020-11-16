package Chapter9;

//9.62. Дано предложение. Определить долю (в %) букв а в нем.
public class Ex9_62 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        double lengthWord = s.length();
        double result = count * 100.00 / lengthWord;
        System.out.println("Доля буквы \"e\" " + result + "%");

    }
}
