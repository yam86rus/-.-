package Chapter9;

import java.util.Arrays;

//9.148. Дан текст. Найти наибольшее количество идущих подряд цифр.
// тут можно считать по разному, в задаче не уточняются пробелы и сцепка с буквами
// будем считать словом или числом, то что разделено пробелом
public class Ex9_148 {
    static int summ(String str) {
        str = str.replaceAll("[^\\d-+]", " ");
        System.out.println(str);
        //    1 2       1         12      123 1 2 3 4 5   1 2 3 4 5 6 123
        str = str.replaceAll("[\\s]{2,} ", " ");
        System.out.println(str);
        //  1 2 1 12 123 1 2 3 4 5 1 2 3 4 5 6 123
        str = str.trim();

        String[] array = str.split(" ");
        // [1, 2, 1, 12, 123, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 123]
        System.out.println(Arrays.toString(array));

        int[] arrayInt = new int[array.length];
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arrayInt);
        // [1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 12, 123, 123]
        System.out.println(Arrays.toString(arrayInt));
        return arrayInt[arrayInt.length - 1];
    }

    public static void main(String[] args) {
        String s = "   1 2 Текст 1   Текст 12 Текст123 1           -200 -3 3 +4 -4 5  Т1Е2К3С4Т5!6 123 ";
        System.out.println(summ(s));
    }
}
