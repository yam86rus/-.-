package Chapter8;

//8.5. Напечатать полную таблицу сложения в виде:
//        1 + 1 = 2
//        2 + 1 = 3
//        ...
//        9 + 1 = 9
//        1 + 2 = 3
//        2 + 2 = 4
//        ...
//        9 + 2 = 11
//        ...
//        ...
//        ...
//        ...
//        1 + 9 = 10
//        2 + 9 = 11
//        ...
//        9 + 9 = 18
public class Ex8_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int summ = i+j;
                System.out.println(i + " + " + j + " = " + summ);
            }
            System.out.println();
        }

    }
}
