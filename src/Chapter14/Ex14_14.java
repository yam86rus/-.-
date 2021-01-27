package Chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//14.14. Напечатать все элементы типизированного файла, каждый элемент которо-го — отдельное слово. Рассмотреть два варианта:
//        1) известно, что в существующем файле записаны 12 слов;
//        2) размер существующего файла неизвестен.
public class Ex14_14 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_14.txt");
            int c;
            while ((c = fileReader.read()) != -1) {

                stringBuilder.append((char) c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] ar = new String(stringBuilder).split(" ");
        System.out.println(Arrays.toString(ar));

    }
}
