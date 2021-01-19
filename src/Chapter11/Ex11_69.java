package Chapter11;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//11.69. Определить количество элементов массива, принадлежащих промежутку от a до b
//        (значения a и b вводятся с клавиатуры; b > a).
public class Ex11_69 {
    static void foo() {
        List<Integer> list = Stream.iterate(2, n -> n += 2).limit(10).collect(Collectors.toList());
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        int minAr = list.stream().min(Integer::compare).get();
        int maxAr = list.stream().max(Integer::compare).get();

        System.out.println("Введите первое значение в диапозоне от " + minAr + " до " + maxAr);
        int a = scanner.nextInt();
        System.out.println("Введите второе значение в диапозоне от " + minAr + " до " + maxAr);
        int b = scanner.nextInt();
        scanner.close();
        int result = (int) list.stream().filter(e -> e >= a && e <= b).count();
        System.out.println("Количество элементов, лежащих в этом диапазоне = " + result);
    }

    static void foo1() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе значение");
        int n2 = scanner.nextInt();
        scanner.close();

        long result = Arrays.stream(ar).filter(value -> value >= n1 && value <= n2).count();
        System.out.println("Количество элементов, лежащих в этом диапазоне = " + result);

    }

    static void foo3() {
        int min = 0;
        int max = 100;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + (int) ((max - min + 1) * Math.random());
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();

        int minimun = Arrays.stream(arr).min().getAsInt();
        int maximum = Arrays.stream(arr).max().getAsInt();
        System.out.printf("Введите число в диапозоне от " + minimun + " до " + maximum);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите первое число");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int n2 = scanner.nextInt();
        scanner.close();
        int result = 0;
        for (int num : arr) {
            if (num >= n1 && num <= n2) result++;
        }
        System.out.println("Количество элементов, лежащих в этом диапазоне = " + result);
    }

    public static void main(String[] args) {
//        foo();
//        foo1();
        foo3();
    }
}
