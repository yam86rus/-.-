package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//14.42. Имеется типизированный файл, элементами которого являются отдельные буквы слова киллобайт.
//        Получить новый файл, в котором ошибки не будет. Размер заданного файла неизвестен.
public class Ex14_42 {
    public Ex14_42() throws IOException {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_42_1.txt"))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s.replaceAll("\\s", ""));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_42_2.txt"))) {
            for (String s : list) {
                bufferedWriter.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
