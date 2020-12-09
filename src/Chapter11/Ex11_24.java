package Chapter11;

import java.util.Arrays;

//11.24. В массиве хранится информация о сопротивлении каждого из 20 элементов электрической цепи.
//        Все элементы соединены параллельно. Определить общее сопротивление цепи.
public class Ex11_24 {
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(1 / Arrays.stream(a).sum());
    }
}
