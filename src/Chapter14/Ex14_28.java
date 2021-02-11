package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.28. Имеется типизированный файл, элементами которого являются отдельные слова.
// Если слово в файле начинается на букву к, то заменить ее на К.
public class Ex14_28 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_28.txt"))) {
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
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == 'к') {
             list.set(i,list.get(i).replaceFirst("к","К"));
            }
        }
        System.out.println(list);
    }
}
