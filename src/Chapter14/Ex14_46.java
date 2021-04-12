package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.46. Имеется файл, элементами которого являются отдельные слова.
//        Записать в другой файл слова, начинающиеся на букву о или а. Размер заданного фай-ла неизвестен.
public class Ex14_46 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_46_1.txt"))) {
            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                list.addAll(Arrays.stream(s.split(" ")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
//    TODO Доделать
}
