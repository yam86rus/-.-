package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//14.43. Имеется типизированный файл с целыми числами.
//        Вставить число 100 после первого числа –100. Результат записать в другой файл.
public class Ex14_43 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_43_1.txt"))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                s = s.replaceAll("\\s{2,}", " ").trim();
                list.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        //TODO доделать
    }
}
