package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.31. Имеется типизированный файл, элементами которого являются отдельные символы.
//        а) Выяснить, являются ли первые два символа цифрами. Если да, то устано-вить, является ли число, образованное этими цифрами, четным.
//        б) Найти число вхождений в файл каждой из букв а, о и у.
//        в) Найти число вхождений в файл сочетания двух соседних букв н и е.
//        г) Выяснить, образуют ли соседние символы файла буквосочетание ура.
public class Ex14_31 {
    static void foo(List<String> l) {
        try {
            int a = Integer.parseInt(l.get(0));
            int b = Integer.parseInt(l.get(1));
            System.out.println((a * 10 + b) % 2 == 0);
        } catch (NumberFormatException e) {
            System.out.print("Одно из значений не является числом");
        }

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_31.txt"))) {
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
        foo(list);
    }
}
