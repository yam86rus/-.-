package Chapter11;

import java.util.Scanner;

//11.9. Заполнить массив:
//        а) десятью первыми членами арифметической прогрессии с известным пер-вым членом прогрессии а и ее разностью р;
//        б) двадцатью первыми членами геометрической прогрессии с известным первым членом прогрессии а и ее знаменателем z;
//        в) двенадцатью первыми членами последовательности Фибоначчи (после-довательности, в которой
//        первые два члена равны 1, а каждый следующий равен сумме двух предыдущих).
public class Ex11_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите член прогрессии \'а\'");
        int a = scanner.nextInt();
        System.out.println("Введите разность прогрессии \'p\'");
        int p = scanner.nextInt();
        int[] array1 = new int[10];
        array1[0] = a;
        for (int i = 1; i <= array1.length - 1; i++) {
            array1[i] = array1[i - 1] + p;
        }
        for (int n : array1) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-----------");
        int[] array2 = new int[20];
        array2[0] = 1;
        array2[1] = 1;
        for (int i = 2; i <= array2.length - 1; i++) {
            array2[i] = array2[i - 2] + array2[i - 1];
        }
        for (int n : array2) {
            System.out.print(n + " ");
        }
    }
}
