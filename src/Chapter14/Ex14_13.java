package Chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//14.13. Напечатать все элементы типизированного файла, каждая запись которого — число. Рассмотреть два варианта:
//        1) известно, что в существующем файле записаны 10 чисел;
//        2) размер существующего файла неизвестен.
public class Ex14_13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_13.txt");
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] arrays = new String(stringBuilder).split(" ");

        System.out.println(Arrays.toString(arrays));
        System.out.println(arrays[2]);

    }
}
