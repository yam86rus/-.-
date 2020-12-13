package Chapter9;

//9.153. Дан текст. Найти наибольшее количество идущих подряд одинаковых сим-
//        волов.
public class Ex9_153 {
    static int foo(String str) {
        int result = 0;
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                result++;
                if (result > count) {
                    count = result;

                }
            } else {
                result = 0;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String s = "Дан текст... Найти!! наибольше количество идущих подряд одинаковых символов";
        System.out.println(foo(s));
    }
}
