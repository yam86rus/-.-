package Chapter12;

import java.util.Arrays;

//2.39. В зрительном зале 25 рядов, в каждом из которых 36 мест (кресел). Информация о проданных билетах хранится в двумерном массиве, номера строк
//        которого соответствуют номерам рядов, а номера столбцов — номерам мест.
//        Если билет на то или иное место продан, то соответствующий элемент массива имеет значение 1,
//        в противном случае — 0. Составить программу, определяющую число проданных билетов на места в 12-м ряду.
public class Ex12_39 {
    public static int[][] fillRandomNumbers(int[][] doubleArray) {
        int down = 0;
        int up = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = down + (int) ((up - down + 1) * Math.random());
            }
        }
        return doubleArray;
    }

    public static int getSoldTickets(int[][] doubleArray, int n) {
        int result =0;
        for (int i=0; i<doubleArray[n].length; i++){
            if (doubleArray[n][i]==1){
                result++;
            }
        }
        System.out.println("Продано билетов в ряду номер: " + n + " - " + result + " шт.");
        return result;
    }

    public static void main(String[] args) {
        int[][] theatre = new int[25][36];
        theatre = fillRandomNumbers(theatre);
        for (int[] numbers : theatre) {
            System.out.println(Arrays.toString(numbers));
        }

        int sold = getSoldTickets(theatre, 12);
    }
}
