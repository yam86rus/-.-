package Chapter14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//14.9. В конец существующего файла записать:
//        а) 6 целых чисел;
//        б) 5 вещественных чисел;
//        в) 4 слова.
//        Записываемые числа и слова вводятся с клавиатуры.
public class Ex14_9 {
    static void foo() throws IOException {
        System.out.println("Введите 6 целых чисел");
        File file = new File("src/Chapter14/Ex14_9.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[6];
        for (int i = 0; i < ar.length; i++) {
            int n = scanner.nextInt();
            ar[i] = n;
        }
        scanner.nextLine();
        fileWriter.write(Arrays.toString(ar) + "\n");


        System.out.println("Введите 5 вещественных чисел");
        double arr1[] = new double[5];
        for (int i = 0; i < arr1.length; i++) {
            scanner.nextLine();
            double d = scanner.nextDouble();
            arr1[i] = d;
        }
        scanner.close();
        try {
            fileWriter.write(Arrays.toString(arr1) + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws IOException {
        foo();
    }
}
