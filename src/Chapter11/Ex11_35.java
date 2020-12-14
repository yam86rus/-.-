package Chapter11;

//11.35. Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах), хранятся в массиве из 18 элементов.
//        В первых шести элементах записаны оценки по обязательной программе; седьмом, ..., двенадцатом — по короткой программе;
//        в остальных — по произвольной программе.
//        Выяс-нить, по какому виду программы спортсмен показал лучший результат.
public class Ex11_35 {
    static int foo(int[] array) {
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        for (int i = 0; i <= 5; i++) {
            result1 += array[i];
            result2 += array[i] + 6;
            result3 += array[i] + 12;
        }
//        System.out.println("1 " + result1);
//        System.out.println("2 " + result2);
//        System.out.println("3 " + result3);

        return Math.max(Math.max(result1, result2), result3);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(foo(array));
    }


}
