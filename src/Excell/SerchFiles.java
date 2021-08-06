package Excell;

import java.io.File;
import java.util.Arrays;

public class SerchFiles {
    public static void main(String[] args) {
        // Определяем каталог
        File file = new File("C:/demo/");

        // Получаем список файлов в это каталоге
        File[] lst1 = file.listFiles();

        // Выводим на печать
        System.out.println(Arrays.toString(lst1));
    }
}
