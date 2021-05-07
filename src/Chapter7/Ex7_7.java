package Chapter7;

import java.util.stream.Stream;

//7.7. Определить количество натуральных чисел из интервала от 100 до 500, сумма
//        цифр которых равна 15.
public class Ex7_7 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100; i<=500;i++){
            if (i/100 + i%10 + i/10%10 == 15){
                count++;
            }
        }
        System.out.println("count = " + count);
        long result = Stream.iterate(100,x->x+1).limit(400).filter(e->(e/100+e%10+e/10%10) == 15).mapToInt(Integer::intValue).count();
        System.out.println("result = " + result);
    }
}
