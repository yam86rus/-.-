package Chapter7;

//7.35. Даны натуральное число n и целые числа
//        a1, a2, a3, ... an
//        Найти:
//        а) количество пар "соседних" чисел ai, равных между собой;
//        б) количество пар "соседних" чисе ai, равных нулю;
//        в) количество пар "соседних" чисел ai, являющихся четными числами;
//        г) количество пар "соседних" чисел ai, оканчивающихся на цифру 5.
public class Ex7_35 {
    public static void main(String[] args) {
        int n = 6;
        int res1 = 0, res2 = 0, res3 = 0, res4 = 0;
        int[] array = {1, 2, 2, 0, 0, 5};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                res1++;
            }
            if (array[i] == 0 && array[i + 1] == 0) {
                res2++;
            }
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                res3++;
            }
            if (array[i] == 5 && array[i + 1] == 5) {
                res4++;
            }

        }
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);

    }
}
