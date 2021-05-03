package Chapter8;

//Напечатать числа в виде следующей таблицы:
//        а)
//        5 5 5 5 5 5
//        5 5 5 5 5 5
//        5 5 5 5 5 5
//        5 5 5 5 5 5
public class Ex8_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4l; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("5 ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int start = 40;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(start + j + " ");
            }
            System.out.println();
            start+=10;

        }
    }
}
