package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.35. Имеется типизированный файл, элементами которого являются отдельные буквы, составляющие последовательность орпцессор.
//        Получить новый файл, в котором буквы слова процессор будут расположены правильно.
public class Ex14_35 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_35.txt"))) {
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
        String s = list.get(0);
        System.out.println(s);
        String s1 = String.valueOf(s.charAt(2))+s.charAt(1)+s.charAt(0)+s.substring(3,s.length());
        System.out.println(s1);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_35.txt"))) {
            bufferedWriter.write(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
