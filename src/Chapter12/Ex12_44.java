package Chapter12;
import java.util.Arrays;

//12.44.В двумерном массиве хранится информация о количестве студентов в той или иной группе каждого курса института с
//        первого по пятый(в первом столбце — информация о группах первого курса,во втором — второго и т.д.).
//        На каждом курсе имеется 10групп.Определить общее число студентов на пятом курсе.

public class Ex12_44 extends FillDoubleArray {
    public static void main(String[] args) {
        FillDoubleArray fill1 = new FillDoubleArray();
        int[][] univer = fill1.fillDoubleArray(new int[10][5],10,40);
        for (int[] numbers: univer){
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println("Студенов на 5 курсе = " + fill1.getSumFromColumn(univer,4));
    }
}
