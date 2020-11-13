package Chapter9;

//9.52. Дано предложение. Составить программу, которая печатает "столбиком" все вхождения
//        в предложение некоторого символа.
public class Ex9_52 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        char c1 = 'е';
        for (int i = 1; i <= s.length() - 1; i++) {
            if (s.charAt(i)== 'е') {
                System.out.println(s.charAt(i));
            }
        }
    }
}
