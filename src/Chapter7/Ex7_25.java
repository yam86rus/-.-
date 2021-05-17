package Chapter7;

import java.util.Arrays;

//.25. Известны оценки по информатике каждого ученика класса. Определить количество пятерок
public class Ex7_25 {
    public static void main(String[] args) {
        int[] array = {3,4,5,4,5,4,3,4,5,4,5};
        System.out.println(Arrays.stream(array).filter(e->e==5).count());
    }
}
