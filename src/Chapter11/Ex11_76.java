package Chapter11;

//11.76. Найти число пар соседних элементов массива, являющихся четными числами.
public class Ex11_76 {
    static int showInfo(double[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] array = {2.00, 4.00, 3.00, 4.00, 5.00, 4.00, 6.00};
        System.out.println("Ответ " + showInfo(array));
    }
}
