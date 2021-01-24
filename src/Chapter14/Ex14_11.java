package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//14.11. Дан типизированный файл, элементами которого являются числа. Напечатать:
//        а) первый элемент;
//        б) третий элемент;
//        в) n-й элемент;
//        г) последний элемент.
public class Ex14_11 {
    public static String FILEPATH = "src/Chapter14/Ex14_11.txt";

    public static void showAllInfo(String pa) {
        File file = new File(FILEPATH);
        try {
            FileReader fileReader = new FileReader(file);
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showFirstElem(String pa) {
        try {
            FileReader fileReader = new FileReader(FILEPATH);
            System.out.println((char) fileReader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void showNElem(String pa, int n) {
        File file = new File(pa);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String s1 = scanner.nextLine();
            System.out.print(s1.charAt(n));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void showLastElem(String pa){
        File file = new File(pa);
        try {
            Scanner scanner = new Scanner(file);
            String res = scanner.nextLine();
            System.out.println(res.charAt(res.length()-1));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        showAllInfo(FILEPATH);
//        showFirstElem(FILEPATH);
//        showNElem(FILEPATH, 3);
        showLastElem(FILEPATH);
//
//        try {
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
