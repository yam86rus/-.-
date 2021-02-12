package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.29. Имеется типизированный файл с числами. Найти:
//        а) сумму первого и второго чисел файла;
//        б) сумму k1-го и k2-го чисел файла;
//        в) произведение первого и последнего чисел файла;
//        г) сумму всех чисел файла;
//        д) количество чисел файла, не превышающих числа а;
//        е) среднее арифметическое положительных чисел файла;
//        ж) первое число, большее числа b. Если таких чисел нет, то сообщить об этом;
//        Типизированные файлы 199
//        з) максимальное число, имеющееся в файле;
//        и) порядковый номер минимального числа в файле. Если таких чисел не-сколько, найти номер первого из них.
//        Во всех задачах принять, что размер файла неизвестен.
public class Ex14_29 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_29.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.addAll(Arrays.stream(s.split(" ")).mapToInt(e -> Integer.parseInt(e)).boxed().collect(Collectors.toList()));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        int a = list.get(0)+list.get(1);
        System.out.println("Сумма первого и второго чисел: " + a);
        int b = list.get(0)*list.get(list.size()-1);
        System.out.println("Произведение первого и последнего чисел файла: " + b);
    }
}
