package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//9.182. Даны два предложения. Напечатать слова, которые есть только в одном из
//        них (в том числе повторяющиеся).
public class Ex9_182 {
    public static void main(String[] args) {
        String str1 = "первое первое предложние и слова из первого предложения ";
        String str2 = "второе предложние а тут нет слов из второго предложения ";

        String[] myArray1 = str1.split(" ");
        String[] myArray2 = str2.split(" ");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < myArray1.length; i++) {
            if (!str2.contains(myArray1[i])) {
                list.add(myArray1[i]);
            }
        }

        for (int i = 0; i < myArray2.length; i++) {
            if (!str1.contains(myArray2[i])) {
                list.add(myArray2[i]);
            }
        }

        System.out.println(list);
    }
}
