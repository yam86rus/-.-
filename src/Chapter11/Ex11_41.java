package Chapter11;

//11.41. Дан массив целых чисел. Вывести на экран сначала его четные элементы,
//        затем нечетные.
public class Ex11_41 {
    static void foo1(int[] array){
        for (int n:array){
            if(n%2==0){
                System.out.print(n+" ");
            }
        }
        for (int n:array){
            if(n%2!=0){
                System.out.print(n+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {-1, 2, -3, 5, 7, 1, 0, 2, 3};
        foo1(a);
    }
}
