package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.30. Имеется типизированный файл, элементами которого являются отдельные слова.
//        а) Найти количество слов, начинающихся на букву м.
//        б) Определить, есть ли в файле слова, начинающиеся на букву к. В случае положительного ответа напечатать порядковый номер первого из них.
//        в) Получить предложение, составленное из слов, порядковый номер которых четный.
//        г) Найти самое длинное слово.
//        Во всех задачах принять, что размер файла неизвестен.
public class Ex14_30 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_30.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println("количество слов, начинающихся на букву \"м\":git p " + list.stream().filter(e->e.startsWith("М")).count());
    }
}
