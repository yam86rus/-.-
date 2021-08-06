package Txt;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SandBox {
    public static void main(String[] args) {
        // Определяем каталог в котором лежат акты
        String myPath = "C:/demo/";
        File filePath = new File(myPath);

        // Получаем список всех файлов в этом каталоге
        List<File> list1 = Arrays.stream(filePath.listFiles()).collect(Collectors.toList());

        // List для хранения только xls файлов
        List<File> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            String fileName = list1.get(i).getName();
            if (fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()).equals("xls")) {
                System.out.println("xls");
                list2.add(list1.get(i));
            } else {
                System.out.println("не xls");
            }
        }

    }
}

