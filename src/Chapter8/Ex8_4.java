package Chapter8;

//8.4. Напечатать числа в виде следующей таблицы:
//        а)
//        0
//        1 0
//        2 1 0
//        3 2 1 0
//        4 3 2 1 0
public class Ex8_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
