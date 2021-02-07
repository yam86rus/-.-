package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//14.26. Имеется типизированный файл с числами. Изменить все его элементы, по-рядковый номер которых кратен трем.
// Новые значения вводятся с клавиату-ры. Рассмотреть два варианта:
//        а) известно, что в существующем файле записаны 20 чисел;
//        б) размер существующего файла неизвестен.
public class Ex14_26 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_26.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                sb.append(s + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        int lenght = new String(sb).split(" ").length;
        System.out.println(lenght/3);
        Scanner scanner = new Scanner(System.in);
        int [] a1 = new int[lenght/3];
        for (int i=0; i<lenght/3;i++){
            System.out.println("Введите новое значение");
            a1[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        // TODO Доделать по заданию
    }
}
