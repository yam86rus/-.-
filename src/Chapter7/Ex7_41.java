package Chapter7;

import java.util.Arrays;

//7.41. Известны оценки каждого из учеников класса по физике. Посчитать количест-
//        во пятерок, количество четверок, количество троек и количество двоек.
public class Ex7_41 {
    public static void main(String[] args) {
        int[] array = Ex7_FillArrayRandom.fillArray(new int[25],2,5);
        System.out.println(Arrays.toString(array));
        System.out.println("Всего элементов " + array.length);

        int result2 = (int) Arrays.stream(array).filter(e->e==2).count();
        System.out.println("Двоек всего: " + result2);

        int result3 = (int) Arrays.stream(array).filter(e->e==3).count();
        System.out.println("Троек всего: " + result3);

        int result4 = (int) Arrays.stream(array).filter(e->e==4).count();
        System.out.println("Четверок всего: " + result4);

        int result5 = (int) Arrays.stream(array).filter(e->e==5).count();
        System.out.println("Пяторок всего: " + result5);
    }
}
