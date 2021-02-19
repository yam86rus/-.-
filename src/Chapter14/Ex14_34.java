package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14.34. Имеется типизированный файл с числами. Поменять местами:
//        а) первое и третье число;
//        б) второе и последнее число;
//        в) n1-е и n2-е число.
public class Ex14_34 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_34.txt"))) {
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
        List<Double> list1 = list.stream().map(Double::parseDouble).collect(Collectors.toList());
        Double n1 = list1.get(0);
        Double n2 = list1.get(2);
        list1.set(0,n2);
        list1.set(2,n1);
        Double last = list1.get(list1.size()-1);
        Double second = list1.get(1);
        list1.set(1,last);
        list1.set(list1.size()-1,second);
        System.out.println(list1);

    }
}
