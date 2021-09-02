package Chapter7;

//7.37. Дана последовательность ненулевых целых чисел. Определить, сколько раз
//        в этой последовательности меняется знак. Например, в последовательности
//        10, –4, 12, 56, –4 знак меняется 3 раза.
public class Ex7_37 {
    static int getCountReverse(int[] array) {
        int result = 0;
        if (array.length == 0) {
            return 0;
        } else if (array.length < 2) {
            return 0;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > 0 && array[i + 1] < 0 || array[i] < 0 && array[i + 1] > 0) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, -4, 12, 56, -4, -5, -6, 6, -6, 6};
        int[] numbers2 = {10, -10};
        int[] numbers3 = {};
        System.out.println(getCountReverse(numbers));
        System.out.println(getCountReverse(numbers2));
        System.out.println(getCountReverse(numbers3));
    }
}
