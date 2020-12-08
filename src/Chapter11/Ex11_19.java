package Chapter11;

import javafx.scene.transform.Scale;

import java.util.Scanner;

//11.19. Определить:
//        а) сумму всех элементов массива;
//        б) произведение всех элементов массива;
//        в) сумму квадратов всех элементов массива;
//        г) сумму шести первых элементов массива;
//        д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся
//        с клавиатуры; k2 > k1);
//        е) среднее арифметическое всех элементов массива;
//        ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1
//        и s2 вводятся с клавиатуры; s2 > s1).
public class Ex11_19 {
    public static double foo(double[] ar, int a, int b) {
        return (ar[a] + ar[b]) / 2.0;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс первого элемента массива");
        int s1 = scanner.nextInt();
        System.out.println("Введите индекс второго элемента массива");
        int s2 = scanner.nextInt();
        System.out.println("Среднее арифметическое двух чисел в массиве " + foo(array, s1, s2));
    }
}
