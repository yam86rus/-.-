package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//14.21. Имеется типизированный файл, элементами которого являются отдельные буквы.
//        Получить слово, образованное элементами файла, имеющими четный порядковый номер.
public class Ex14_21 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_21.txt"))) {
            String str;
            while ((str=bufferedReader.readLine())!=null){
                sb.append(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        for (int i=1; i<sb.length();i+=2){
            System.out.print(sb.charAt(i));
        }
    }
}
