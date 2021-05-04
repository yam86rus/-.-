package Chapter8;
//8.2. Напечатать числа в виде следующей таблицы:
//        а)
//        5
//        5 5
//        5 5 5
//        5 5 5 5
//        5 5 5 5 5
//
//        б)
//        1 1 1 1 1
//        1 1 1 1
//        1 1 1
//        1 1
//        1
public class Ex8_2 {
    public static void main(String[] args) {
        for (int i=1; i<6;i++){
            for (int j=1; j<=i; j++){
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }
}
