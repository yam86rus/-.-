package Chapter7;

public class Ex7_FillArrayRandom {
    static int[] fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            int random = min + (int) ((max - min + 1) * Math.random());
            arr[i] = random;
        }
        return arr;
    }
}
