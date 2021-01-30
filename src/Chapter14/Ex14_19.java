package Chapter14;

import javax.xml.transform.sax.SAXResult;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//14.19. Имеется типизированный файл, элементами которого являются отдельные сло-ва. Напечатать все слова, начинающиеся на букву с. Рассмотреть два варианта:
//        а) известно, что в существующем файле записаны 30 слов;
//        б) размер существующего файла неизвестен.
public class Ex14_19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\yam86\\Desktop\\Java-programming-tasks\\src\\Chapter14\\Ex14_19.txt")
        )){
          String str;
          while ((str = bufferedReader.readLine())!=null){
              System.out.println(str);
              for (String s: str.split(" ")){
                  if (s.startsWith("с")){
                    list.add(s);
                  }
              }
//              System.out.println();
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }

}
