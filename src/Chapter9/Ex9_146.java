package Chapter9;

import java.util.Arrays;

//Дан текст, имеющий вид: "d1 d2 d3 ...", где di — цифры (n > 1). Вычис-
//        лить записанную в тексте алгебраическую сумму.
public class Ex9_146 {
    static int summ(String str) {
        int result = 0;
        str = str.replaceAll("d", "");
        String[] s2 = str.split(" ");
        for (int i = 0; i <= s2.length - 1; i++) {
            result += Integer.parseInt(s2[i]);
        };
//        Java 8
//        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        return result;
    }

    public static void main(String[] args) {
        String s = "d2 d4 d6 d8 d10";
        System.out.println(summ(s)); // 30
    }
}
