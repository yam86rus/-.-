package Chapter14;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//14.24. Изменить все элементы существующего типизированного файла, в котором записаны числа.
//          Новые значения вводятся с клавиатуры. Рассмотреть два ва-рианта:
//        а) известно, что в существующем файле записаны 10 чисел;
//        б) размер существующего файла неизвестен.
public class Ex14_24 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_24.txt"))
        ) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] ar = new String(stringBuilder).split(" ");
        int[] ar1 = new int[ar.length];
        System.out.println("Введите поочередно " +  ar.length + " символов.");
        for (int i=0; i<ar.length; i++){
            ar1[i] = scanner.nextInt();
        }
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_24.txt")) {
           for (int n: ar1){
               fileWriter.write(String.valueOf(n)+" ");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
