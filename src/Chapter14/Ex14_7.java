package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//14.7. Дана последовательность целых чисел, оканчивающаяся нулем.
//        Записать все числа последовательности в типизированный файл.
public class Ex14_7 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ar = {10, 20, 30, 100000};
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        File file = new File("src/Chapter14/Ex14_7.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(Arrays.toString(ar));
        pw.println(list);
        pw.close();
    }
}
