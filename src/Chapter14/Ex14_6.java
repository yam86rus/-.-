package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

//14.6. Дано предложение. Записать каждый из его символов в файл.
//        Какая структу-ра файла наиболее целесообразна для решения этой задачи?
public class Ex14_6 {
    static void writeToFile(String str) throws FileNotFoundException {
        File file = new File("src/Chapter14/Ex14_6.txt");
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < str.length(); i++) {
            pw.println(str.charAt(i));
        }
        pw.close();
    }
    static void writeToFile1(String str) throws FileNotFoundException {
        File file = new File("src/Chapter14/Ex14_6.txt");
        PrintWriter pw = new PrintWriter(file);
        char[] chars = str.toCharArray();
        pw.println(chars);
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String s = "Дано предложение. Записать каждый из его символов в файл.";
//        writeToFile(s);
        writeToFile1(s);
    }
}
