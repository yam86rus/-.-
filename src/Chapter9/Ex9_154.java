package Chapter9;

import java.util.Arrays;

//9.154. Дано слово. Определить, сколько различных букв в нем.
public class Ex9_154 {
    static int foo (String s){
        return 0;
    }
    public static void main(String[] args) {
        String s = "aaabbcccc";
        // distinct() Возвращает стрим без дубликатов
        System.out.println(s.chars().distinct().count());
        int [] array = {1,1,2,2,2,3,3};
        System.out.println(Arrays.stream(array).sum());
    }
}
