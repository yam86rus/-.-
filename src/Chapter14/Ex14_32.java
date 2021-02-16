package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

//14.32. В типизированном файле записаны названия городов и их численность.
//        Уве-личить численность каждого города на 5%. (Количество жителей — всегда целое число.)
public class Ex14_32 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_32.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                s.split(";");
                list.addAll(Arrays.stream(s.split(";")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String city = list.get(i).split(" ")[0];
            Integer popular = Integer.valueOf(list.get(i).split(" ")[1]);
            map.put(city, (int) (popular * 0.05)+popular);
        }
        System.out.println(map);
    }
}
