package Chapter12;
import static Chapter12.Ex12_40.fillRandomNumbersFull;
import static Chapter12.Ex12_40.showInfoFromArray;

//12.43. В двумерном массиве хранится информация о зарплате 18 человек за каждый месяц года
//        (за январь — в первом столбце, за февраль — во втором и т. д.).
//        Определить общую зарплату, выплаченную в июне.
public class Ex12_43 {
    public static int getSallaryInMonth (int[][] salary, int month){
        int result = 0;
        for (int i=0; i<salary.length;i++){
            result += salary[i][month];
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] salary = new int[18][12];
        salary = fillRandomNumbersFull(salary,10000,20000);
        showInfoFromArray(salary);
        System.out.println(getSallaryInMonth(salary,5));
    }
}
