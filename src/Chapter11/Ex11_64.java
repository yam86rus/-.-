package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

//11.64. Дан массив целых чисел. Определить:
//        а) количество элементов, отличных от последнего элемента;
//        б) количество элементов, кратных a.
public class Ex11_64 {
    public static void main(String[] args) {
        int[] ar = {1, 5, 3, 4, 5};
        int resultA = (int) Arrays.stream(ar).filter(e -> e != ar[ar.length - 1]).count();
        System.out.println(resultA);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дан  массив " + Arrays.toString(ar));
        System.out.println("Введите индекс в массиве");
        int n = scanner.nextInt();
        System.out.print("Количество элементов кратных " + ar[n] + " = ");
        System.out.println(Arrays.stream(ar).filter(e -> e % ar[n] == 0).count());
    }
}
