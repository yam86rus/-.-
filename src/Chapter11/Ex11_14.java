package Chapter11;

//11.14. Вывести элементы массива на экран в обратном порядке.
public class Ex11_14 {
    public static void main(String[] args) {
        int[] s = {2, 4, 6, 8, 10};
        String[] s1 = {"Иванов", "Петров", "Сидоров"};
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.print(s1[i] + " ");
        }

    }
}
