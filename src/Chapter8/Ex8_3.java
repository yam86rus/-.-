package Chapter8;

//8.3. Напечатать числа в виде следующей таблицы:
//        а)
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
public class Ex8_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
