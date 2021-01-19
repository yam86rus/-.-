package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

//14.3. Создать типизированный файл и записать в него числа 10, 12, ..., 16.
public class Ex14_3 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ar = {10, 12, 14, 16};
        File file = new File("src/Chapter14/Ex14_3.txt");
        PrintWriter pw = new PrintWriter(file);
//        for (int n : ar) {
//            pw.print(n + " ");
//        }
//        можно и так
//        pw.println(Arrays.toString(ar));
        pw.close();
    }
}
