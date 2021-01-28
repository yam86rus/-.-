package Chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//14.15. Имеется файл, в котором записаны 12 вещественных чисел. Переписать все числа файла в массив в том же порядке.
public class Ex14_15 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_15.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        String[] ar = new String(sb).split(" ");
        int ar1[] = Arrays.stream(ar).mapToInt(e-> Integer.parseInt(e)).toArray();
        System.out.println(Arrays.toString(ar1));
    }
}
