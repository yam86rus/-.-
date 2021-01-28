package Chapter14;

import java.io.*;

//14.17. Имеется типизированный файл с числами. Напечатать все его элементы с нечетным порядковым номером. Рассмотреть два варианта:
//        а) известно, что в существующем файле записаны 20 чисел;
//        б) размер существующего файла неизвестен.
public class Ex14_17 {
    static void readFile(File f) {
        String str ="";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            str = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] ar = str.trim().split(" ");
        for (int i=0; i<ar.length;i+=2){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_17.txt");
        readFile(file);
    }
}

