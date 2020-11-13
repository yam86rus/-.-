package Chapter9;

import java.util.ArrayList;

//9.59. Дано предложение. Определить число букв о в нем.
public class Ex9_59 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        // первый способ
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'о') {
                count++;
            }
        }
        System.out.println(count);

    }
}
