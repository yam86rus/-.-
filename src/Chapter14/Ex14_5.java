package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//14.5. Дан массив из двадцати вещественных чисел.
//        Записать все числа массива в типизированный файл в том же порядке.
public class Ex14_5 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = Stream.iterate(1, e -> e += 1).limit(20).collect(Collectors.toList());
        File file = new File("src/Chapter14/Ex14_5.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(list);
        pw.close();


    }
}
