package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//14.18. Имеется типизированный файл с числами. Напечатать все его элементы, большие числа а. Рассмотреть два варианта:
//        а) известно, что в существующем файле записаны 13 чисел;
//        б) размер существующего файла неизвестен.
public class Ex14_18 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_18.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str);
                sb.append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] ar = new String(sb).split(" ");
        int[] result = Arrays.stream(new String(sb).split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] fin = Arrays.stream(result).filter(e -> e > 70).toArray();
        System.out.println(Arrays.toString(fin));
    }

}
