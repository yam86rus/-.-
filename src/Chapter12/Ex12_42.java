package Chapter12;
import static Chapter12.Ex12_40.fillRandomNumbersFull;
import static Chapter12.Ex12_40.showInfoFromArray;

//12.42. В поезде 18 вагонов, в каждом из которых 36 мест.
//        Информация о продан-ных на поезд билетах хранится в двумерном массиве,
//        номера строк которых соответствуют номерам вагонов, а номера столбцов — номерам мест.
//        Если билет на то или иное место продан, то соответствующий элемент массива имеет
//        значение 1, в противном случае — 0. Составить программу, опреде-ляющую число
//        свободных мест в любом из вагонов поезда.
public class Ex12_42 {

    public static int getFreeBilets (int [][] someTrainArray, int vagon){
        int result = 0;
        for (int i=0; i<someTrainArray[vagon].length; i++ ){
            if (someTrainArray[vagon][i]==0){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] someTrain = new int[18][36];
        someTrain = fillRandomNumbersFull(someTrain,0,1);
        showInfoFromArray(someTrain);
        System.out.println("///");
        System.out.println(getFreeBilets(someTrain,17));

    }
}
