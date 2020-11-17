package Chapter9;

import java.util.List;

//9.66. Дано предложение. В нем слова разделены одним пробелом (начальные и конечные пробелы
//        и символ "-" в предложении отсутствуют). Определить количество слов в предложении.
public class Ex9_66 {
    public static void main(String[] args) {
        String s = "Начальные и конечные пробелы и символ отсутствует";
        int count = s.length() - s.replace(" ","").length();
        System.out.println(count);
    }
}
