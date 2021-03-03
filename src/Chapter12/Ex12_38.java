package Chapter12;
import Chapter12.Ex12_35.*;

import java.util.Arrays;

import static Chapter12.Ex12_35.randomNumber;

//12.38. В двумерном массиве хранится информация о баллах, полученных спорт-сменами-пятиборцами в каждом из пяти видов спорта
//        (в первой строке — информация о баллах первого спортсмена, во второй — второго и т. д.). Об-щее число спортсменов равно 20.
//        Определить общую сумму баллов, набран-ных третьим спортсменом.
public class Ex12_38 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[5][20];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = randomNumber();
            }
        }
        for (int[] i : doubleArray){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("//----------//");
        int result = 0;
        for (int i=0; i<doubleArray.length;i++){
            result+=doubleArray[i][2];
        }
        System.out.println("Общая суммас баллов, набран-ных третьим спортсменом = " + result);
    }

}
