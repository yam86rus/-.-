package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//14.20. Имеется типизированный файл, в котором записаны 18 целых чисел.
//        Пере-писать все положительные числа файла в массив в том же порядке.
public class Ex14_20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_20.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                for (String s : str.split(" ")) {
                    if (Integer.parseInt(s) > 0) {
                        list.add(Integer.parseInt(s));
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
