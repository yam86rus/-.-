package Chapter11;
//11.7. Заполнить массив из двадцати элементов так, как представлено на рис. 11.2.
public class Ex11_7 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = array.length-1; i >= 0; i--) {
            array[i] = array.length - i;
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
