package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.36. Имеется типизированный файл, элементами которого являются отдельные буквы, составляющие последовательность кадировко.
//        Получить новый файл, в котором буквы слова кодировка будут расположены правильно.
public class Ex14_36 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_36.txt"))) {
            String s;
            while ((s=bufferedReader.readLine())!=null){
              list.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);

        for (int i=0; i<list.size();i++){
            if (list.get(i).equals("кадировко")){
                list.set(i,"кодировка");
            }
        }

        System.out.println(list);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_36.txt"))) {
            for (String s: list){
                bufferedWriter.write(s +" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
