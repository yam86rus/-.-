package Chapter11;

//11.4. Массив предназначен для хранения значений ростов двенадцати человек.
//        С помощью датчика случайных чисел заполнить массив целыми значениями,
//        лежащими в диапазоне от 163 до 190 включительно.
public class Ex11_4 {
    public static void main(String[] args) {
        int down = 163;
        int up = 190;
        int[] array = new int[12];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
