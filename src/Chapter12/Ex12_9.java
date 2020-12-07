package Chapter12;

//12.9. Дан двумерный массив. Поменять местами:
//        а) элементы, расположенные в правом верхнем и левом нижнем углах;
//        б) элементы, расположенные в правом нижнем и левом верхнем углах.
public class Ex12_9 {
    static void replaceInArray(int[][] arr) {
        int n1 = arr[0][0];
        int num = arr[arr.length - 1].length-1;
        int n2 = arr[arr.length - 1][num];
        arr[0][0] = n2;
        arr[arr.length - 1][num] = n1;
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
        replaceInArray(array);
        show(array);
    }
}
