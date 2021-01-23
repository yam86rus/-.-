package Chapter14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//14.10. Создать типизированный файл, элементами которого являются двенадцать
//        первых членов последовательности Фибоначчи (последовательности,
//        в кото-рой первые два члена равны 1, а каждый следующий равен с
//        умме двух пре-дыдущих).
public class Ex14_10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < 12; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }
        File file = new File("src/Chapter14/Ex14_10.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(String.valueOf(list)+'\n');
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
