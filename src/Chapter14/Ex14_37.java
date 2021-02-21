package Chapter14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//14.37. Имеется типизированный файл, элементами которого являются отдельные буквы,
//        составляющие последовательность олгаритм. Получить новый файл, в котором
//        буквы слова алгоритм будут расположены правильно.
public class Ex14_37 {
    public static void main(String[] args) {
        String info = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\ex14_37.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                s = s.trim();
                s = s.replaceAll("\\s+","");
                info = s.charAt(3)+s.substring(1,3)+s.charAt(0)+s.substring(4);
                            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(info);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\ex14_37_done.txt"))) {
         bufferedWriter.write(info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
