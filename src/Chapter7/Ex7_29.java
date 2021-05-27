package Chapter7;

import java.util.ArrayList;
import java.util.List;

import static Chapter7.Ex7_FillListRandom.getFillList;

//7.29. Известны оценки по химии каждого ученика класса. Определить количество
//        пятерок и количество двоек.

public class Ex7_29 {

    public static void main(String[] args) {
        List<Integer> grade = getFillList(2, 5, 30);
        System.out.println(grade);
        System.out.println("Двоек: "
                .concat(String.valueOf(grade.stream()
                        .filter(e -> e == 2)
                        .count())));
        System.out.println("Пятерок: "
                .concat(String.valueOf(grade.stream()
                        .filter(e -> e == 5)
                        .count())));
    }

}
