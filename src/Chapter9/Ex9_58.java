package Chapter9;

//9.58. Дано предложение. Вывести "столбиком" его первый,
//        второй, пятый, шестой, девятый, десятый и т. д. символы.
public class Ex9_58 {
    public static void main(String[] args) {
        //1,2, 5,6 9,10 шаг +4

        String s = "12aa56aa91aa34";
        for (int i = 0; i <= s.length() - 1; i += 4) {
            if (i == s.length() - 1) {
                System.out.println(s.charAt(i));
            } else {
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(i + 1));

            }
        }

    }
}
