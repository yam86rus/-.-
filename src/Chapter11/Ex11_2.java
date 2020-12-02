package Chapter11;

import java.util.Scanner;

//11.2. Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры
//        в ходе выполнения программы.
public class Ex11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Необходимо внести данные в массив. Длина массива: 10");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scanner.nextInt();
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
