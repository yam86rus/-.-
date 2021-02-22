package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//14.38. Составить программу обмена местами двух любых элементов типизирован-ного файла,
//        в котором записаны отдельные символы.
public class Ex14_38 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Введите номер элемента из первого файла");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Введите номер элемента из второго файла");
        int n2 = scanner.nextInt();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_38_1.txt"))) {
            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                list.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Выбранный эллемент из первого файла = " + list.get(n1));
        //TODO Доделать запись во второй файл
    }
}
