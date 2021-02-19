package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

//14.33. В типизированном файле записаны фамилии людей и их вес. Увеличить вес каждого человека на 3%.
public class Ex14_33 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Double> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_33.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.addAll(Arrays.stream(s.split(";")).collect(Collectors.toList()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Double weight = Double.valueOf(list.get(i).split(" ")[1]);
            map.put(list.get(i).split(" ")[0], weight * 0.03 + weight);
        }
        System.out.println(map);

    }
}
