package Chapter9;
//9.181.Даны два предложения.Для каждого слова первого предложения опреде-лить,входит ли оно во второе предложение.
// Повторяющиеся слова первого предложения не рассматривать.

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex9_181 {
    public static void main(String[] args) {
        String str1 = "первый пятый шестой второй седьмой первый";
        String str2 = "первый класс второй класс третий класс четвертый класс";

        List<String> list1 = Arrays.stream(str1.trim().toLowerCase().split(" ")).collect(Collectors.toList());
        System.out.println(list1);
        List<String> list = Arrays.stream(str2.trim().toLowerCase().split(" ")).collect(Collectors.toList());
        System.out.println(list);
                for (int i = 0; i < list1.size();i++) {
            System.out.print(list.contains(list1.get(i)) + " ");
        }
    }
}
