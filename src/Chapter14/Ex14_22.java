package Chapter14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//14.22. В существующем типизированном файле, элементами которого являются числа, изменить на заданное число:
//        а) первый элемент;
//        б) пятый элемент;
//        в) k-й элемент;
//        г) последний элемент.
//        Новое значение вводится с клавиатуры.
public class Ex14_22 {
    static void foo(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_22.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arr = new String(stringBuilder).split(" ");
        arr[0] = Integer.toString(num);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_22.txt"))) {
            for (String s : arr) {
                bufferedWriter.write(s+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int n = scanner.nextInt();

        foo(4);
    }
}
