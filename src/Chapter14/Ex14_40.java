package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Имеется файл, элементами которого являются отдельные слова. Переписать их в другой файл. Размер заданного файла неизвестен.
public class Ex14_40 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_40_1.txt"))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                myList.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(myList);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_40_2.txt"))) {
            for (String str: myList){
                bufferedWriter.write(str +" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
