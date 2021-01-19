package Chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//14.2. Создать типизированный файл и записать в него:
//        а) 5 одинаковых целых чисел;
//        б) 5 одинаковых вещественных чисел;
//        в) 5 одинаковых слов.
//        Записываемые числа и слова вводятся с клавиатуры.
public class Ex14_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Chapter14/Ex14_2.txt");
        PrintWriter pw = new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            pw.print(n + " ");
        }
        pw.println();
        System.out.println("Введите вещественное число");
        double n2 = scanner.nextDouble();
        for (int i = 0; i < 5; i++) {
            pw.print(n2 + " ");
        }
        pw.println();

        System.out.println("Введите любое слово");
        scanner.nextLine();
        String s = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            pw.print(s + " ");
        }
        pw.close();
    }
}
