package Chapter11;

import java.util.Arrays;

//11.88. Известны стоимости нескольких марок легковых автомобилей и мотоциклов.
//        Верно ли, что средняя стоимость автомобилей превышает среднюю
//        стоимость мотоциклов более чем в 3 раза? Стоимость одного автомобиля
//        превышает $5000, что больше стоимости любой марки мотоцикла.
public class Ex11_88 {
    public static void main(String[] args) {
        double[] cars = {1,2,3,4,5,6,7,8,10};
        double[] bikes = {11,12,13,14,15,16,17,18};
        System.out.println(Arrays.stream(cars).average().orElse(0)>Arrays.stream(bikes).average().orElse(0));
    }
}
