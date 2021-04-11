package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//14.44. Имеется типизированный файл, элементами которого являются отдельные буквы слова оловяный.
//        Получить новый файл, в котором не будет орфогра-фической ошибки.
public class Ex14_44 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_44_1.txt"))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
                s=s.replaceAll("оловяный.","оловянный.");
                list.add(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);

    }

}
