package Chapter11;

import java.util.Arrays;

//11.53. Дан массив целых чисел.
//        а) Все элементы, кратные числу 10, заменить нулем.
//        б) Все нечетные элементы удвоить, а четные уменьшить вдвое.
//        в) Нечетные элементы уменьшить на m, а элементы с нечетными номерами увеличить на n.
public class Ex11_53 {
    public static void main(String[] args) {
        int[] a = {1, 20, 3, 40, 5};
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            if(a[i]%10==0){
                a[i]=0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
