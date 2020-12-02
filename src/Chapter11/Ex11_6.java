package Chapter11;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
