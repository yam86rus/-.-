package Chapter11;

import java.util.Arrays;

//11.90. Дан массив. Определить количество элементов, больших суммы всех эле-ментов массива, и напечатать их номера.
public class Ex11_90 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,-6,-5,-5,-5};
        // некорректное условие
        int summ = Arrays.stream(array).sum();
        System.out.println(Arrays.stream(array).filter(e-> e>summ).count());
    }
}
