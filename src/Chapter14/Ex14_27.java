package Chapter14;

import java.io.*;
import java.util.Arrays;

//14.27. Имеется типизированный файл с целыми числами. Все его четные элементы заменить нулями. Рассмотреть два варианта:
//        а) известно, что в существующем файле записаны 13 чисел;
//        б) размер существующего файла неизвестен.
public class Ex14_27 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_27.txt"))){
            String s;
            while ((s=bufferedReader.readLine())!=null){
                stringBuilder.append(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
        String [] ar = (new String(stringBuilder).split(" "));
        System.out.println(Arrays.toString(ar));
        for (int i=1; i<ar.length;i+=2){
            ar[i]= String.valueOf(0);
        }
        System.out.println(Arrays.toString(ar));
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Максим\\IdeaProjects\\Java-programming-tasks\\src\\Chapter14\\Ex14_27.txt"))) {
            for (String s: ar){
                bufferedWriter.write(s + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
