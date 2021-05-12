package Chapter11;

import java.util.Arrays;

//11.75. В массиве записаны оценки по иностранному языку каждого из 22 учеников
//        класса. Определить количество пятерок, количество четверок, количество
//        троек и количество двоек.
public class Ex11_75 {
    public static void main(String[] args) {
        int[] grade = {4, 4, 4, 4, 3, 4, 5, 4, 3, 4, 3, 4, 2, 3, 4, 2, 3, 4, 5, 4, 3, 4, 4, 5};
        int count4 = 0, count5 = 0, count3 = 0;
        long result4 = Arrays.stream(grade)
                .filter(e -> e == 4)
                .count();

        for (int number : grade) {
            if (number == 4) count4++;
            else if (number == 5) count5++;
            else if (number == 3) count3++;
        }
        System.out.println(result4);
        System.out.println("//");
        System.out.println(" 4 : " + count4 + " шт. 5: " + count5 + " шт.  3: " + count3 + " шт. ");
    }
}