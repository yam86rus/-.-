package Chapter12;

import java.util.Arrays;

//12.40. В двумерном массиве хранится информация о количестве студентов в той или
//        иной группе каждого курса института с первого по пятый (в первой строке — информация о
//        группах первого курса, во второй — второго и т. д.). На каждом курсе имеется 8 групп.
//        Составить программу для расчета общего числа студентов на любом курсе.
public class Ex12_40 {
    public static int[][] fillRandomNumbersFull(int[][] doubleArray, int min, int max) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = min + (int) ((max - min + 1) * Math.random());
            }
        }
        return doubleArray;
    }

    public static void showInfoFromArray(int[][] da) {
        for (int[] n : da) {
            System.out.println(Arrays.toString(n));
        }
    }

    public static void showStudentsInCourse (int[][] da, int course){
        int result = 0;
        for (int i=0; i<da[course].length; i++){
            result += da[course][i];
        }
        System.out.println("Всего студенов на " + course + " курсе= " + result);
    }

    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][8];
        fillRandomNumbersFull(myDoubleArray, 10, 20);
        showInfoFromArray(myDoubleArray);
        showStudentsInCourse(myDoubleArray,3);

    }
}
