package Chapter11;

//11.5. Массив предназначен для хранения значений весов двадцати человек.
//        С помощью датчика случайных чисел заполнить массив целыми значениями,
//        лежащими в диапазоне от 50 до 100 включительно.
public class Ex11_5 {
    public static void main(String[] args) {
        int down = 50;
        int up = 100;
        int[] array = new int[20];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
