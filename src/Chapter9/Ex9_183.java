package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//9.183. Даны два предложения. Напечатать слова, которые встречаются в двух предложениях только один раз.
public class Ex9_183 {
    public static void main(String[] args) {
        String str1 = "Напечатать слова, напечатать которые встречаются в двух предложениях только один раз.";
        String str2 = "Напечатать слова, которые только два раза.";

        String[] array1 = str1.split(" ");
        String[] array2 = str2.split(" ");

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


        // TODO Доделать через коллекции
    }
}
