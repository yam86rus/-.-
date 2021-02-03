package Chapter14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//14.23. В существующем типизированном файле, элементами которого являются отдельные слова, изменить на заданное слово:
//        а) первое слово;
//        б) третье слово;
//        в) s-е слово;
//        г) последнее слово.
//        Новое слово вводится с клавиатуры.
public class Ex14_23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_23.txt"));
//             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_23.txt"))
        ) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array = new String(sb).split(" ");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите замену для первого слова");
        String s1 = scanner.nextLine();
        System.out.println("Введите замену для второго слова");
        String s2 = scanner.nextLine();
        System.out.println("Введите замену для последнего слова");
        String s3 = scanner.nextLine();
        array[0] = s1;
        array[2] = s2;
        array[array.length - 1] = s3;
        System.out.println(Arrays.toString(array));
    }
}
