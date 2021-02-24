package Chapter14;

import java.io.*;

//14.39. Имеется файл с числами. Переписать все числа в другой файл. Размер задан-ного файла неизвестен.
public class Ex14_39 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Ex14_36_3.bin"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Ex14_36_3.bin"));
        ) {
            for (int i : array) {
                dataOutputStream.write(i);
            }
            int a ;
            while ((a = dataInputStream.read()) != -1) {
                System.out.print(a+" ");
            }
            System.out.println(dataInputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
