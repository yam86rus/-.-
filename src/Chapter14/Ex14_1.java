package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//14.1. Создать типизированный файл и записать в него:
//        а) число 500;
//        б) число 4,5;
//        в) слово Привет.
public class Ex14_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Chapter14/Ex14_1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(500);
        pw.println(4.5);
        pw.println("Привет");
        pw.close();
    }
}
