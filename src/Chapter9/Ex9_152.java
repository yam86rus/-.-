package Chapter9;

//9.152. Дано предложение. Найти наибольшее количество идущих подряд пробелов.
public class Ex9_152 {
    static int spaceCounter(String s) {
        int result = 0;
        int count = 0;
        if (s.length() > 0) {
            for (int i = 0; i <= s.length() - 1; i++) {
                if (s.charAt(i) == ' ') {
                    result++;
                } else {
                    if (result > count) {
                        count = result;
                    }
                    result = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Дано    предложение.       Найти   наибольшее  количество иду щих подряд пробелов.";
        System.out.println(spaceCounter(s));
    }
}
