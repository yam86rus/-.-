package Chapter11;

//11.8. Заполнить массив из восьми элементов таким образом, чтобы значения эле-ментов
//        при просмотре массива слева направо образовывали:
//        а) убывающую последовательность;
//        б) возрастающую последовательность.
//        Варианты, представленные в задачах 11.6 и 11.7, не использовать.
public class Ex11_8 {
    public static void main(String[] args) {
        int a = 8; // размер массива
        int[] array1 = new int[a];
        int[] array2 = new int[a];

        for (int i = 0; i <= a - 1; i++) {
            array2[i] = i + 1;
            array1[i] = a - i;
        }
        System.out.println("Данные второго массива:");
        for (int n : array2) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Данные первого массива:");
        for (int n : array1) {
            System.out.print(n + " ");
        }

    }
}
