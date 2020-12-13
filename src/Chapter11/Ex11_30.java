package Chapter11;

import java.util.Arrays;

//11.30. В массиве хранится информация о численности учеников в каждом из 42 классов школы.
//        Выяснить, верно ли, что общее число учеников в школе есть четырехзначное число.
public class Ex11_30 {
    static boolean checkStudents(int[] array) {
        int a = Arrays.stream(array).sum();
        int count = 0;
        while (a > 0) {
            count++;
            a /= 10;
        }
        return (count  == 4) ? true : false;
    }

    public static void main(String[] args) {
        int[] students = {1000, 2, 3, 4, 5, 6};
        System.out.println(checkStudents(students));
    }
}
