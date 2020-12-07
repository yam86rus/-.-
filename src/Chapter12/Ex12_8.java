package Chapter12;

//12.8. Составить программу:
//        а) заменяющую значение любого элемента второго столбца двумерного мас-сива числом 13;
//        б) заменяющую значение любого элемента двумерного массива числом b.
public class Ex12_8 {
    public static int[][] replaceColumn(int[][] ar, int a) {
        for (int i = 0; i <= ar.length-1; i++) {
            ar[i][1] = a;
        }
        return ar;
    }

    static void show(int[][] ar) {
        for (int[] n : ar) {
            for (int n1 : n) {
                System.out.print(n1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int n = 13;
        show(array);
        System.out.println("---------");
        int[][] array2 = replaceColumn(array, 13);
        show(array2);

    }
}
