package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//14.12. Дан типизированный файл, элементами которого являются отдельные слова. Напечатать:
//        а) первый элемент;
//        б) пятый элемент;
//        в) k-й элемент;
//        г) последний элемент.
public class Ex14_12 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_12.txt");
        try {
            Scanner scanner = new Scanner(file);
            String s = scanner.nextLine();
            String[] result = s.split(" ");
            System.out.println(result[0]);
            System.out.println(result[4]);
            System.out.println(result[result.length-1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
