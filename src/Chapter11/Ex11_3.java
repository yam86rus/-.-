package Chapter11;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

//11.3. Заполнить массив из пятнадцати элементов случайным образом:
//        а) вещественными значениями, лежащими в диапазоне от 0 до 1;
//        б) вещественными значениями х (22 х < 23);
//        в) вещественными значениями х (0 х < 10);
//        г) вещественными значениями х (–50 х < 50);
//        д) целыми значениями, лежащими в диапазоне от 0 до 10 включительно.
public class Ex11_3 {
    public static void main(String[] args) {
        double[] array1 = new double[15];
        double[] array2 = new double[15];
        double[] array3 = new double[15];
        double[] array4 = new double[15];
        int[] array5 = new int[15];

        for (int i = 0; i <= array1.length - 1; i++) {
            array1[i] = Math.random();
        }
        System.out.println("Данные в первом массиве:");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (double n : array1) {
            String s = decimalFormat.format(n);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Данные во втором массиве");

        for (int i = 0; i <= array2.length - 1; i++) {
            array2[i] = Math.random() + 22;
        }
        for (double n : array2) {
            decimalFormat.applyPattern("#.###");
            String s = decimalFormat.format(n);
            System.out.print(s + " ");
        }
        System.out.println();
        int down = 0;
        int up = 9;
        for (int i = 0; i <= array3.length - 1; i++) {
            array3[i] = down + (up - down + 1) * Math.random();
        }
        System.out.println("Данные в третьем массиве");
        for (double n : array3) {
            String s = decimalFormat.format(n);
            System.out.print(s + " ");
        }
        System.out.println();
        int down1 = -50;
        int up1 = 50;
        for (int i = 0; i <= array3.length - 1; i++) {
            array4[i] = down1 + (up1 - down1 + 1) * Math.random();
        }
        System.out.println("Данные в четвертом массиве");
        for (double n : array4) {
            String s = decimalFormat.format(n);
            System.out.print(s + " ");
        }
        System.out.println();
        int down2 = 0;
        int up2 = 10;
        for (int i = 0; i <= array3.length - 1; i++) {
            array5[i] = down2 + (int) ((up2 - down2 + 1) * Math.random());
        }
        System.out.println("Данные в пятом массиве");
        for (int n : array5) {
            System.out.print(n + " ");
        }

    }
}
