package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//14.25. Элементами типизированного файла являются отдельные слова. Изменить все его элементы на другие слова (их значения вводятся с клавиатуры). Рас-смотреть два варианта:
//        а) известно, что в существующем файле записаны 12 слов;
//        б) размер существующего файла неизвестен.
public class Ex14_25 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_25.txt"))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = new String(stringBuilder).split(" ").length;
        String[] arr = new String[count];
        System.out.println("Введите новые значения для слов в количестве " + count + " шт ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название слова № " + i);
            arr[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_25.txt"))){
            bufferedWriter.write(Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
