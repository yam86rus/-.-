package Chapter11;

import java.util.Arrays;

//11.44. В массиве хранится информация о количестве побед, одержанных 20 фут-больными командами.
//        Определить номера команд, имеющих меньше трех побед.
public class Ex11_44 {
    static void foo1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 4, 1, 7, 4, 0, 2, 4};
        System.out.println(Arrays.toString(a));
        foo1(a);
    }
}
