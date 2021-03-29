package Chapter12;

import java.util.Arrays;
import java.util.Scanner;

import static Chapter12.Ex12_40.fillRandomNumbersFull;

//12.41. В двумерном массиве хранится информация о зарплате 20 человек за каждый месяц года (первого человека — в первой строке, второго — во второй и т. д.).
//       Составить программу для расчета общей зарплаты, полученной
//       за год любым человеком, информация о зарплате которого представлена в массиве.
public class Ex12_41 {
    public static double getSallaryByYear(int[][] myda, int n) {
        int result = 0;
        for (int i = 0; i < myda.length; i++) {
            result += myda[i][n];
        }
        return result;
    }

    public static double getSallaryByYear(double[][] myda, int n) {
        int result = 0;
        for (int i = 0; i < myda.length; i++) {
            result += myda[i][n];
        }
        return result;
    }


    public static void main(String[] args) {
        double[][] myDoubleArray = new double[2][12];
        myDoubleArray = fillRandomNumbersFull(myDoubleArray, 10000.00, 20000.00);
        int maxEmployeeNumber = myDoubleArray[0].length;
        System.out.println("Введите номер сотрудника от 1 до " + maxEmployeeNumber);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.println(Arrays.toString(myDoubleArray[i]));
        }
        System.out.println(getSallaryByYear(myDoubleArray, n));


    }
}
