package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//14.4. Создать файл и записать в него:
//        а) 7 целых чисел;
//        б) 4 вещественных чисел;
//        в) 5 слов.
//        Записываемые числа и слова вводятся с клавиатуры.
public class Ex14_4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Chapter14/Ex14_4.txt");
        PrintWriter pw = new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 7 чисел");
        List<Integer> list = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Введите 4 вещественных числа");
        for (int i = 0; i < 4; i++) {
            list2.add(scanner.nextDouble());
        }
        scanner.nextLine();
        System.out.println("Введите 5 слов");
        for (int i = 0; i < 5; i++) {
            list3.add(scanner.nextLine());
        }


        pw.println(list);
        pw.println(list2);
        pw.println(list3);

        scanner.close();
        pw.close();

    }
}
