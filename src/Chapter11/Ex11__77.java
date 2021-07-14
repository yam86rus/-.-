package Chapter11;

import java.util.stream.Stream;

//11.77. Найти число пар соседних элементов массива, оканчивающихся нулем.
public class Ex11__77 {
    public static void main(String[] args) {
        int result=0;
        int[] ar = {1,2,0,0,0,0,3,0};
        for (int i=0;i<ar.length-1;i++){
            if (ar[i]==0 && ar[i+1]==0){
                result++;
            }
        }
        System.out.println("Найдено: " + result);
    }
}
