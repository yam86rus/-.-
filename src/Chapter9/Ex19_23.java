package Chapter9;
//9.23. Дано слово. Получить его часть, образованную идущими подряд буквами, начиная с m-й и кончая n-й.

import java.util.Scanner;

public class Ex19_23 {
    public static void main(String[] args) {
        String str = "Слово";
        int m = 0, n = 2;
        System.out.println(str.substring(m, n));
    }
}
