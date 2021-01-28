package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//14.16. Имеется файл, элементами которого являются отдельные буквы. Получить слово, образованное этими буквами.
public class Ex14_16 {
    public static void main(String[] args) {
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_16.txt"))) {
            result = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        String fin = result.replaceAll("[\\s+]", "");
        System.out.println(fin);

//        String person = "name=john age=13 year=2001";
//        for (String str : person.split(" ")) {
//            System.out.println(str.replace("=", " = "));
//        }
//        Выход:
//        name = john
//        возраст = 13
//        год = 2001
    }
}
